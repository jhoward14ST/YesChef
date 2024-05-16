import { combineReducers } from "@reduxjs/toolkit";

import { placeholder } from "ducks"

const placeholderReducer = (state = {}) => state;

const rootReducer = combineReducers({
  placeholder: placeholderReducer,
});

export type RootState = ReturnType<typeof rootReducer>;

export default rootReducer;