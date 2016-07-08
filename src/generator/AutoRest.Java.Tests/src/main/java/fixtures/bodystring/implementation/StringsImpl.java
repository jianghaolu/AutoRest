/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import retrofit2.Retrofit;
import fixtures.bodystring.Strings;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.Base64Url;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodystring.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;

/**
 * An instance of this class provides access to all the operations defined
 * in Strings.
 */
public final class StringsImpl implements Strings {
    /** The Retrofit service to perform REST calls. */
    private StringsService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATServiceImpl client;

    /**
     * Initializes an instance of Strings.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public StringsImpl(Retrofit retrofit, AutoRestSwaggerBATServiceImpl client) {
        this.service = retrofit.create(StringsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Strings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface StringsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("string/null")
        Call<ResponseBody> putNull(@Body String stringBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/empty")
        Call<ResponseBody> getEmpty();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("string/empty")
        Call<ResponseBody> putEmpty(@Body String stringBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/mbcs")
        Call<ResponseBody> getMbcs();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("string/mbcs")
        Call<ResponseBody> putMbcs(@Body String stringBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/whitespace")
        Call<ResponseBody> getWhitespace();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("string/whitespace")
        Call<ResponseBody> putWhitespace(@Body String stringBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/notProvided")
        Call<ResponseBody> getNotProvided();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/base64Encoding")
        Call<ResponseBody> getBase64Encoded();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/base64UrlEncoding")
        Call<ResponseBody> getBase64UrlEncoded();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("string/base64UrlEncoding")
        Call<ResponseBody> putBase64UrlEncoded(@Body Base64Url stringBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("string/nullBase64UrlEncoding")
        Call<ResponseBody> getNullBase64UrlEncoded();

    }

    /**
     * Get null string value value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<String> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute());
    }

    /**
     * Get null string value value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getNullAsync(final ServiceCallback<String> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getNull();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<String>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<String> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<String, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Set string value null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putNull() throws ErrorException, IOException {
        final String stringBody = null;
        Call<ResponseBody> call = service.putNull(stringBody);
        return putNullDelegate(call.execute());
    }

    /**
     * Set string value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putNullAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        final String stringBody = null;
        Call<ResponseBody> call = service.putNull(stringBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putNull(String stringBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putNull(stringBody);
        return putNullDelegate(call.execute());
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putNullAsync(String stringBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.putNull(stringBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get empty string value value ''.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<String> getEmpty() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getEmpty();
        return getEmptyDelegate(call.execute());
    }

    /**
     * Get empty string value value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getEmptyAsync(final ServiceCallback<String> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getEmpty();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<String>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getEmptyDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<String> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<String, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putEmpty(String stringBody) throws ErrorException, IOException, IllegalArgumentException {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putEmpty(stringBody);
        return putEmptyDelegate(call.execute());
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putEmptyAsync(String stringBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (stringBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter stringBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putEmpty(stringBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putEmptyDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<String> getMbcs() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getMbcs();
        return getMbcsDelegate(call.execute());
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getMbcsAsync(final ServiceCallback<String> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getMbcs();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<String>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getMbcsDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<String> getMbcsDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<String, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMbcs(String stringBody) throws ErrorException, IOException, IllegalArgumentException {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putMbcs(stringBody);
        return putMbcsDelegate(call.execute());
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putMbcsAsync(String stringBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (stringBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter stringBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putMbcs(stringBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMbcsDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMbcsDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<String> getWhitespace() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getWhitespace();
        return getWhitespaceDelegate(call.execute());
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getWhitespaceAsync(final ServiceCallback<String> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getWhitespace();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<String>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getWhitespaceDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<String> getWhitespaceDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<String, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putWhitespace(String stringBody) throws ErrorException, IOException, IllegalArgumentException {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putWhitespace(stringBody);
        return putWhitespaceDelegate(call.execute());
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putWhitespaceAsync(String stringBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (stringBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter stringBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putWhitespace(stringBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putWhitespaceDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putWhitespaceDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the String object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<String> getNotProvided() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNotProvided();
        return getNotProvidedDelegate(call.execute());
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getNotProvidedAsync(final ServiceCallback<String> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getNotProvided();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<String>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNotProvidedDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<String> getNotProvidedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<String, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get value that is base64 encoded.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<byte[]> getBase64Encoded() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getBase64Encoded();
        ServiceResponse<Base64Url> response = getBase64EncodedDelegate(call.execute());
        byte[] body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDecodedBytes();
        }
        return new ServiceResponse<byte[]>(body, response.getResponse());
    }

    /**
     * Get value that is base64 encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getBase64EncodedAsync(final ServiceCallback<byte[]> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getBase64Encoded();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<byte[]>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Base64Url> result = getBase64EncodedDelegate(response);
                    byte[] body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDecodedBytes();
                    }
                    serviceCallback.success(new ServiceResponse<byte[]>(body, result.getResponse()));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Base64Url> getBase64EncodedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Base64Url, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Base64Url>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get value that is base64url encoded.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<byte[]> getBase64UrlEncoded() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getBase64UrlEncoded();
        ServiceResponse<Base64Url> response = getBase64UrlEncodedDelegate(call.execute());
        byte[] body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDecodedBytes();
        }
        return new ServiceResponse<byte[]>(body, response.getResponse());
    }

    /**
     * Get value that is base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getBase64UrlEncodedAsync(final ServiceCallback<byte[]> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getBase64UrlEncoded();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<byte[]>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Base64Url> result = getBase64UrlEncodedDelegate(response);
                    byte[] body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDecodedBytes();
                    }
                    serviceCallback.success(new ServiceResponse<byte[]>(body, result.getResponse()));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Base64Url> getBase64UrlEncodedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Base64Url, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Base64Url>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putBase64UrlEncoded(byte[] stringBody) throws ErrorException, IOException, IllegalArgumentException {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Base64Url stringBodyConverted = Base64Url.encode(stringBody);
        Call<ResponseBody> call = service.putBase64UrlEncoded(stringBodyConverted);
        return putBase64UrlEncodedDelegate(call.execute());
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putBase64UrlEncodedAsync(byte[] stringBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (stringBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter stringBody is required and cannot be null."));
            return null;
        }
        Base64Url stringBodyConverted = Base64Url.encode(stringBody);
        Call<ResponseBody> call = service.putBase64UrlEncoded(stringBodyConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putBase64UrlEncodedDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putBase64UrlEncodedDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<byte[]> getNullBase64UrlEncoded() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNullBase64UrlEncoded();
        ServiceResponse<Base64Url> response = getNullBase64UrlEncodedDelegate(call.execute());
        byte[] body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDecodedBytes();
        }
        return new ServiceResponse<byte[]>(body, response.getResponse());
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getNullBase64UrlEncodedAsync(final ServiceCallback<byte[]> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getNullBase64UrlEncoded();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<byte[]>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Base64Url> result = getNullBase64UrlEncodedDelegate(response);
                    byte[] body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDecodedBytes();
                    }
                    serviceCallback.success(new ServiceResponse<byte[]>(body, result.getResponse()));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Base64Url> getNullBase64UrlEncodedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Base64Url, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Base64Url>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
