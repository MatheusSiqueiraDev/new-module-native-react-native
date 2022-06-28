
import React from 'react';
import {View, Text, NativeModules} from 'react-native';

function App() {
  function teste() {
    NativeModules.ModuleToast.show("Olá mundo!");
  }
  return(
    <View>
      {teste()}
    </View>
  )
}

export default App;
