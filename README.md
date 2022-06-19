-------------------
![This is an image](https://github.com/quangbk198/AndroidCleanArchitecture-CryptocurrencyApp/blob/master/images/clean-architecture.PNG?raw=true)

# Clean Architecture with MVVM in Android

- In this repository, I am going to combine MVVM with [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html) to build a sample app in Android. The app has 2 main screen: coin list and coin detail. Video demo app will show in the section below. 
- You can click the above link to learn more about Clean Architecture theory 

-------------------

# Data flow
![This is an image](https://github.com/quangbk198/AndroidCleanArchitecture-CryptocurrencyApp/blob/master/images/diagram.PNG?raw=true)

-------------------

# Diagram of app architecture

There are 3 layers in the structure of project: Presentation layer, Domain layer and Data layer

![This is an image](https://github.com/quangbk198/AndroidCleanArchitecture-CryptocurrencyApp/blob/master/images/three-layers.png?raw=true)

#### - Presentation layer: 

- This layer includes Android UIs (Activity, Fragment, View,...) and ViewModel. 
- The role of the UIs is to display the application data on the screen. Never put your business logic in Activitys or Fragments.
- Besides, this layer has a component, which is State holders. In this project, I use State holder to hold data, expose it to the UI via Kotlin Flow.

#### - Domain layer:

- Domain layer sits between the Presentation layer and Data layer. It contains all the use case of your application. Each particular features can be considered as a Use case.
- This layer executes business logic. It receives events from UIs and communicates with Data layer to perform this event, or gets data from Data layer to update UIs.
- Different from the plain MVVM, most of business logic will execute in Domain layer instead of in ViewModel. ViewModel still has business logic, but less.
- Repository in Domain layer contains interfaces which have methods to communicate with Data layer.

#### - Data layer:

- Data layer will manage data sources: remote, local, etc.
- Repository in Data layer contains the classes that will implement from interfaces in repository of the Domain layer.

-------------------

#  Library

- Language: [Kotlin](https://kotlinlang.org/)
- Dependency Injection: [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
- Executes Asynchronously: [Kotlin Coroutines](https://developer.android.com/kotlin/coroutines?gclid=CjwKCAiA4KaRBhBdEiwAZi1zzrfte38ccz4Cv6bj_OGNL4KpQMa9HyaiZhW7z-StHJ7DQjK1OjDnHhoCLYwQAvD_BwE&gclsrc=aw.ds)
- Make network call: [Retrofit](https://square.github.io/retrofit/) 
- Native UI: [Jetpack Compose](https://developer.android.com/jetpack/compose)

-------------------

#  API

- The project use [Coinpaprika API](https://api.coinpaprika.com/) to get data of crypto

-------------------

#  Demo app

![This is an image](https://github.com/quangbk198/AndroidCleanArchitecture-CryptocurrencyApp/blob/master/images/demo-app.gif?raw=true)

-------------------

#  Conclusion

This is a simple project implemented Clean Architecture and MVVM. It has 2 main features: show list coin and view coin detail. I hope the project helps you understand about how to implement MVVM with Clean Architecture in Android Development.

##### Thanks and best regards.


