import React from "react";
import { View, Text } from "react-native";
import { useNavigation } from "@react-navigation/native";

import { navigate } from "navigation";

const GroceryListItemScreen = () => {
    const navigation = useNavigation();
    const navigator = navigate(navigation);

    return (
        <View>
            <Text>This is the Grocery List Item Screen</Text>
        </View>
    );
};

export default GroceryListItemScreen;