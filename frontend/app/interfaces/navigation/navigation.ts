import { StackNavigationOptions } from '@react-navigation/stack';
import React from 'react';

interface NavStatelessComponent extends React.FC {
    navigationOptions?: StackNavigationOptions;
}

export default NavStatelessComponent;