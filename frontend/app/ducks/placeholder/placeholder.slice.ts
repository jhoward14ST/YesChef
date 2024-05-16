import { createSlice, PayloadAction } from '@reduxjs/toolkit';

const initialState = {
    placeholderVariable: null,
};

const placeholder = createSlice({
    name: 'placeholder',
    initialState,
    reducers: {
        setPlaceholder(state, action: PayloadAction<any>) {
            state.placeholderVariable = action.payload;
        },
    },
});

const { setPlaceholder } = placeholder.actions;

export const actions = { setPlaceholder };

export const namespace = placeholder.name;

export const reducer = placeholder.reducer;