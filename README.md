
# react-native-riskified-beacon

## Getting started

`$ npm install react-native-riskified-beacon --save`

### Mostly automatic installation

`$ react-native link react-native-riskified-beacon`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-riskified-beacon` and add `RNReactNativeRiskifiedBeacon.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeRiskifiedBeacon.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.DM.RiskifiedBeacon.RNReactNativeRiskifiedBeaconPackage;` to the imports at the top of the file
  - Add `new RNReactNativeRiskifiedBeaconPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-riskified-beacon'
  	project(':native-riskified-beacon').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-riskified-beacon/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      implementation project(':react-native-riskified-beacon')
      compile project(':react-native-riskified-beacon')
  	```

## Usage
```javascript
import RiskifiedBeacon from 'react-native-riskified-beacon';

// TODO: What to do with the module?
RiskifiedBeacon;
```
