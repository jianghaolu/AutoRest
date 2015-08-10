// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.url;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;

public interface paths {
    @GET("/paths/bool/true/{boolPath}")
     getBooleanTrue(Boolean boolPath);

    @GET("/paths/bool/true/{boolPath}")
    void getBooleanTrueAsync(Boolean boolPath, Callback<Response> cb);

    @GET("/paths/bool/false/{boolPath}")
     getBooleanFalse(Boolean boolPath);

    @GET("/paths/bool/false/{boolPath}")
    void getBooleanFalseAsync(Boolean boolPath, Callback<Response> cb);

    @GET("/paths/int/1000000/{intPath}")
     getIntOneMillion(Integer intPath);

    @GET("/paths/int/1000000/{intPath}")
    void getIntOneMillionAsync(Integer intPath, Callback<Response> cb);

    @GET("/paths/int/-1000000/{intPath}")
     getIntNegativeOneMillion(Integer intPath);

    @GET("/paths/int/-1000000/{intPath}")
    void getIntNegativeOneMillionAsync(Integer intPath, Callback<Response> cb);

    @GET("/paths/long/10000000000/{longPath}")
     getTenBillion(Long longPath);

    @GET("/paths/long/10000000000/{longPath}")
    void getTenBillionAsync(Long longPath, Callback<Response> cb);

    @GET("/paths/long/-10000000000/{longPath}")
     getNegativeTenBillion(Long longPath);

    @GET("/paths/long/-10000000000/{longPath}")
    void getNegativeTenBillionAsync(Long longPath, Callback<Response> cb);

    @GET("/paths/float/1.034E+20/{floatPath}")
     floatScientificPositive(Double floatPath);

    @GET("/paths/float/1.034E+20/{floatPath}")
    void floatScientificPositiveAsync(Double floatPath, Callback<Response> cb);

    @GET("/paths/float/-1.034E-20/{floatPath}")
     floatScientificNegative(Double floatPath);

    @GET("/paths/float/-1.034E-20/{floatPath}")
    void floatScientificNegativeAsync(Double floatPath, Callback<Response> cb);

    @GET("/paths/double/9999999.999/{doublePath}")
     doubleDecimalPositive(Double doublePath);

    @GET("/paths/double/9999999.999/{doublePath}")
    void doubleDecimalPositiveAsync(Double doublePath, Callback<Response> cb);

    @GET("/paths/double/-9999999.999/{doublePath}")
     doubleDecimalNegative(Double doublePath);

    @GET("/paths/double/-9999999.999/{doublePath}")
    void doubleDecimalNegativeAsync(Double doublePath, Callback<Response> cb);

    @GET("/paths/string/unicode/{stringPath}")
     stringUnicode(String stringPath);

    @GET("/paths/string/unicode/{stringPath}")
    void stringUnicodeAsync(String stringPath, Callback<Response> cb);

    @GET("/paths/string/begin%21%2A%27%28%29%3B%3A%40%20%26%3D%2B%24%2C%2F%3F%23%5B%5Dend/{stringPath}")
     stringUrlEncoded(String stringPath);

    @GET("/paths/string/begin%21%2A%27%28%29%3B%3A%40%20%26%3D%2B%24%2C%2F%3F%23%5B%5Dend/{stringPath}")
    void stringUrlEncodedAsync(String stringPath, Callback<Response> cb);

    @GET("/paths/string/empty/{stringPath}")
     stringEmpty(String stringPath);

    @GET("/paths/string/empty/{stringPath}")
    void stringEmptyAsync(String stringPath, Callback<Response> cb);

    @GET("/paths/string/null/{stringPath}")
     stringNull(String stringPath);

    @GET("/paths/string/null/{stringPath}")
    void stringNullAsync(String stringPath, Callback<Response> cb);

    @GET("/paths/enum/green%20color/{enumPath}")
     enumValid(UriColor enumPath);

    @GET("/paths/enum/green%20color/{enumPath}")
    void enumValidAsync(UriColor enumPath, Callback<Response> cb);

    @GET("/paths/string/null/{enumPath}")
     enumNull(UriColor enumPath);

    @GET("/paths/string/null/{enumPath}")
    void enumNullAsync(UriColor enumPath, Callback<Response> cb);

    @GET("/paths/byte/multibyte/{bytePath}")
     byteMultiByte(Buffer bytePath);

    @GET("/paths/byte/multibyte/{bytePath}")
    void byteMultiByteAsync(Buffer bytePath, Callback<Response> cb);

    @GET("/paths/byte/empty/{bytePath}")
     byteEmpty(Buffer bytePath);

    @GET("/paths/byte/empty/{bytePath}")
    void byteEmptyAsync(Buffer bytePath, Callback<Response> cb);

    @GET("/paths/byte/null/{bytePath}")
     byteNull(Buffer bytePath);

    @GET("/paths/byte/null/{bytePath}")
    void byteNullAsync(Buffer bytePath, Callback<Response> cb);

    @GET("/paths/date/2012-01-01/{datePath}")
     dateValid(Date datePath);

    @GET("/paths/date/2012-01-01/{datePath}")
    void dateValidAsync(Date datePath, Callback<Response> cb);

    @GET("/paths/date/null/{datePath}")
     dateNull(Date datePath);

    @GET("/paths/date/null/{datePath}")
    void dateNullAsync(Date datePath, Callback<Response> cb);

    @GET("/paths/datetime/2012-01-01T01%3A01%3A01Z/{dateTimePath}")
     dateTimeValid(Date dateTimePath);

    @GET("/paths/datetime/2012-01-01T01%3A01%3A01Z/{dateTimePath}")
    void dateTimeValidAsync(Date dateTimePath, Callback<Response> cb);

    @GET("/paths/datetime/null/{dateTimePath}")
     dateTimeNull(Date dateTimePath);

    @GET("/paths/datetime/null/{dateTimePath}")
    void dateTimeNullAsync(Date dateTimePath, Callback<Response> cb);

}