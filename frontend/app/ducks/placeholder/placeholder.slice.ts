import { createSlice, PayloadAction } from '@reduxjs/toolkit';

const initialState = {
};

const placeholder = createSlice({
    name: 'placeholder',
    initialState,
    reducers: {
        setPlaceholder(state, action: PayloadAction<any>) {
            return action.payload;
        },
    },
});

const { setPlaceholder } = placeholder.actions;

export const actions = { setPlaceholder };

export const namespace = placeholder.name;

export const reducer = placeholder.reducer;