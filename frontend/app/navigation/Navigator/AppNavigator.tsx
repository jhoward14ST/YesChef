import React from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";

const AppStack = createStackNavigator();

const App = (): React.ReactElement => {
    return (
        <NavigationContainer>
            <AppStack.Navigator screenOptions={{ presentation: "modal" }}>
                <AppStack.Screen
                    name="Home"
                    component={Home}
                />
                {/* Add the screens here */}
            </AppStack.Navigator>
        </NavigationContainer>
    );
};

export default App;