cljsExports = {};
cljsExports["react"] = require('react');
cljsExports["react-native"] = require('react-native');
cljsExports["create-react-class"] = require('create-react-class');

var figBridge = require("react-native-figwheel-bridge");

figBridge.shimRequire(cljsExports);
figBridge.start({appName:   "figMainTest",
                 optionsUrl: "http://localhost:8081/target/public/cljs-out/dev/cljsc_opts.json"});
