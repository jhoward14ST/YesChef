import React from 'react';
import { StackNavigationOptions } from '@react-navigation/stack';
import { Text } from 'react-native';

const navigationOptions = (): StackNavigationOptions => ({
    headerStyle: {
        backgroundColor: 'green',
    },
    headerBackTitle: null,
    headerTitle: () => (
        <Text>RecipeItem</Text>
    ),
});

export default navigationOptions;