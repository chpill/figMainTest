# Testing figwheel main bridge



## Run dev environment

```
clj -m figwheel.main -b dev -r
```

```
react-native run-android
```

## todos

* remove `App.js`
* move `dummy.js` out of the project root
* Launch figwheel-main inside a REPL
* Try to make a functionning release build
  - isolate `cljsExports` into their own file?
  - create a different main file for prod, that registers the root component

