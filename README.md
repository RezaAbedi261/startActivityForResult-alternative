# Alternative way to use startActivityForResult

This is two extension for registering a callback for an Activity Result. As [developer.android](https://developer.android.com/training/basics/intents/result) pointed out this extension can handle callback for activity result with/without request code.

## Usage


Define result as below in root of activity class
```kotlin
val INTEGER_REQUEST_CODE = 1
private val testResult = startActivityResultReqCode(INTEGER_REQUEST_CODE) { result, reqCode ->

    //call function or do what ever you want.... 
    //for example :
    //onActivityResult(reqCode, result)    
}

```
 and then launch your intent when ever you want.
```kotlin
testResult.launch(intent)

```
also you can initialize result and callback without request code

```kotlin
private val testResult = startActivityResult() { result ->

    //call function or do what ever you want.... 
    //for example :
    //onActivityResult(result)    
}

```
 and then launch your intent when ever you want.
```kotlin
testResult.launch(intent)

```
