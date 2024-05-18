import React from "react";
import { View, Text } from "react-native";
import { useNavigation } from "@react-navigation/native";

import { navigate } from "navigation";

const RecipesScreen = () => {
    const navigation = useNavigation();
    const navigator = navigate(navigation);

    return (
        <View>
            <Text>This is the Inventory Screen</Text>
        </View>
    );
};

export default RecipesScreen;