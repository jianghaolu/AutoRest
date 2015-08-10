// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodycomplex;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;

public interface arrayOperations {
    @GET("/complex/array/valid")
    ArrayWrapper getValid();

    @GET("/complex/array/valid")
    void getValidAsync(Callback<Response> cb);

    @PUT("/complex/array/valid")
     putValid(ArrayWrapper complexBody);

    @PUT("/complex/array/valid")
    void putValidAsync(ArrayWrapper complexBody, Callback<Response> cb);

    @GET("/complex/array/empty")
    ArrayWrapper getEmpty();

    @GET("/complex/array/empty")
    void getEmptyAsync(Callback<Response> cb);

    @PUT("/complex/array/empty")
     putEmpty(ArrayWrapper complexBody);

    @PUT("/complex/array/empty")
    void putEmptyAsync(ArrayWrapper complexBody, Callback<Response> cb);

    @GET("/complex/array/notprovided")
    ArrayWrapper getNotProvided();

    @GET("/complex/array/notprovided")
    void getNotProvidedAsync(Callback<Response> cb);

}