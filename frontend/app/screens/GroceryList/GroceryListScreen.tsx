import React from "react";
import { View, Text } from "react-native";
import { useNavigation } from "@react-navigation/native";

import { navigate } from "navigation";

interface Props {
}

const GroceryListScreen = () => {
    const navigation = useNavigation();
    const navigator = navigate(navigation);
    
    return (
        <View>
            <Text>This is the Grocery List Screen</Text>
        </View>
    );
};

export default GroceryListScreen;