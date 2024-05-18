import React, { useState, useEffect } from 'react';
import { Provider } from 'react-redux';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { SafeAreaProvider } from 'react-native-safe-area-context';
import { enableScreens } from 'react-native-screens';

import AppNavigator from './app/navigation/Navigator/AppNavigator';
// import store from './app/redux/store';

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});

const App: React.FC = () => {
  enableScreens();

  const [ready, setReady] = useState(true);

  let body = <View />;

  if (ready) {
    body = (
      // <Provider store={store}>
        <View style={styles.container}>
          <AppNavigator />
        </View>
      // </Provider>
    );
  
  }

  return (
    <SafeAreaProvider>
      <StatusBar style="dark" />
      {body}
    </SafeAreaProvider>
  );
}

export default App;
