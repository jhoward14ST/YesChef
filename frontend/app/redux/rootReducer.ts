import { combineReducers } from "@reduxjs/toolkit";

import { placeholder } from "ducks";

const rootReducer = combineReducers({
  placeholder: placeholder.reducer,
});

export type RootState = ReturnType<typeof rootReducer>;

export default rootReducer;