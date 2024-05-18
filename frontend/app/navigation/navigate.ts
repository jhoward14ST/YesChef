import throttle from "lodash/throttle";

const navigateOneTime = (navigate) => throttle(navigate, 1000, { trailing: false });

/* push */

const openRecipes = (navigation) => (props = {}) => {
    navigation.navigate("Recipes", props);
};

const openRecipeItem = (navigation) => (props = {}) => {
    navigation.navigate("RecipeItem", props);
};

const openInventory = (navigation) => (props = {}) => {
    navigation.navigate("Inventory", props);
};

const openInventoryItem = (navigation) => (props = {}) => {
    navigation.navigate("InventoryItem", props);
};

const openGroceryList = (navigation) => (props = {}) => {
    navigation.navigate("GroceryList", props);
};

const openGroceryListItem = (navigation) => (props = {}) => {
    navigation.navigate("GroceryListItem", props);
};

const navigate = (navigation) => ({
    goBack: navigation.goBack,
    openRecipes: navigateOneTime(openRecipes(navigation)),
    openRecipeItem: navigateOneTime(openRecipeItem(navigation)),
    openInventory: navigateOneTime(openInventory(navigation)),
    openInventoryItem: navigateOneTime(openInventoryItem(navigation)),
    openGroceryList: navigateOneTime(openGroceryList(navigation)),
    openGroceryListItem: navigateOneTime(openGroceryListItem(navigation))
});

export default navigate;