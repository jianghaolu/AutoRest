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

public interface polymorphicrecursive {
    @GET("/complex/polymorphicrecursive/valid")
    Fish getValid();

    @GET("/complex/polymorphicrecursive/valid")
    void getValidAsync(Callback<Response> cb);

    @PUT("/complex/polymorphicrecursive/valid")
     putValid(Fish complexBody);

    @PUT("/complex/polymorphicrecursive/valid")
    void putValidAsync(Fish complexBody, Callback<Response> cb);

}