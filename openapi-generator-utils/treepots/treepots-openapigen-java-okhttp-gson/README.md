# treepots-openapigen-java-okhttp-gson

OpenAPI Tree Pots
- API version: 1.0.0

Example spec


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>treepots-openapigen-java-okhttp-gson</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:treepots-openapigen-java-okhttp-gson:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/treepots-openapigen-java-okhttp-gson-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import fr.jmini.openapi.openapitools.okhttpgson.ApiClient;
import fr.jmini.openapi.openapitools.okhttpgson.ApiException;
import fr.jmini.openapi.openapitools.okhttpgson.Configuration;
import fr.jmini.openapi.openapitools.okhttpgson.models.*;
import fr.jmini.openapi.openapitools.okhttpgson.api.IpsumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.company.xyz/v2");

    IpsumApi apiInstance = new IpsumApi(defaultClient);
    try {
      SomeObject result = apiInstance.op199();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpsumApi#op199");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.company.xyz/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IpsumApi* | [**op199**](docs/IpsumApi.md#op199) | **GET** /ipsum/issue199 | 
*LoremApi* | [**getCase1**](docs/LoremApi.md#getCase1) | **GET** /case1 | Update an existing pet
*LoremApi* | [**getPolymorphic**](docs/LoremApi.md#getPolymorphic) | **GET** /polymorphic | 
*LoremApi* | [**issue7754**](docs/LoremApi.md#issue7754) | **GET** /issue7754 | Codegen
*LoremApi* | [**op708**](docs/LoremApi.md#op708) | **GET** /pull708 | 
*LoremApi* | [**op75**](docs/LoremApi.md#op75) | **GET** /pull75 | 
*LoremApi* | [**pull66**](docs/LoremApi.md#pull66) | **GET** /pull66 | 


## Documentation for Models

 - [Element](docs/Element.md)
 - [Enum2WithCustomName](docs/Enum2WithCustomName.md)
 - [EnumInArrayOfArray](docs/EnumInArrayOfArray.md)
 - [EnumWithCustomName](docs/EnumWithCustomName.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [Int2Enum](docs/Int2Enum.md)
 - [IntEnum](docs/IntEnum.md)
 - [ItemWithBoolean](docs/ItemWithBoolean.md)
 - [Leave](docs/Leave.md)
 - [LeaveAllOf](docs/LeaveAllOf.md)
 - [Long2Enum](docs/Long2Enum.md)
 - [LongEnum](docs/LongEnum.md)
 - [LongEnumWithCustomName](docs/LongEnumWithCustomName.md)
 - [LongModel](docs/LongModel.md)
 - [Node](docs/Node.md)
 - [NodeAllOf](docs/NodeAllOf.md)
 - [ObjWithEnums](docs/ObjWithEnums.md)
 - [SomeObject](docs/SomeObject.md)
 - [String2Enum](docs/String2Enum.md)
 - [StringEnum](docs/StringEnum.md)
 - [Task](docs/Task.md)
 - [Weather](docs/Weather.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



