import { configureStore, Action } from "@reduxjs/toolkit";
import { ThunkAction } from "redux-thunk";
import { persistReducer, persistStore } from "redux-persist";
import AsyncStorage from "@react-native-async-storage/async-storage";

import rootReducer, { RootState } from "./rootReducer";

const persistConfig = {
    key: "root",
    storage: AsyncStorage,
    blacklist: [],
    whitelist: ["placeholder"],
};

const persistedReducer = persistReducer(persistConfig, rootReducer);

const store = configureStore({
    reducer: persistedReducer,
    // Was an empty array, but created an error
    middleware: getDefaultMiddleware => getDefaultMiddleware(),
});

export const persistor = persistStore(store);

export type AppDispatch = typeof store.dispatch;

export type AppThunk = ThunkAction<void, RootState, null, Action<string>>;

export default store;