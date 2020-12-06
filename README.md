# Alternative way to use startActivityForResult

This is two extension for registering a callback for an Activity Result. as [developer.android](https://developer.android.com/training/basics/intents/result) pointed out this extension can handle callback for activity result with/without request code.

## Usage



```java
startActivityResult(intent) { result ->
    resultFortest(result)
}
```
or
```java
startActivityResultReqCode(intent, CREATE_REQUEST_CODE) { result, requestCode ->
    resultForCreateFile(result, CREATE_REQUEST_CODE)
}
```
