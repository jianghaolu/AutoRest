/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.RestClient;

/**
 * The interface for AutoRestComplexTestService class.
 */
public interface AutoRestComplexTestService {
    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "http://localhost";

    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
     */
    RestClient restClient();

    /**
     * Gets API ID..
     *
     * @return the apiVersion value.
     */
    String apiVersion();

    /**
     * Sets API ID..
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself
     */
    AutoRestComplexTestService withApiVersion(String apiVersion);

    /**
     * Gets the Basics object to access its operations.
     * @return the Basics object.
     */
    Basics basics();

    /**
     * Gets the Primitives object to access its operations.
     * @return the Primitives object.
     */
    Primitives primitives();

    /**
     * Gets the Arrays object to access its operations.
     * @return the Arrays object.
     */
    Arrays arrays();

    /**
     * Gets the Dictionarys object to access its operations.
     * @return the Dictionarys object.
     */
    Dictionarys dictionarys();

    /**
     * Gets the Inheritances object to access its operations.
     * @return the Inheritances object.
     */
    Inheritances inheritances();

    /**
     * Gets the Polymorphisms object to access its operations.
     * @return the Polymorphisms object.
     */
    Polymorphisms polymorphisms();

    /**
     * Gets the Polymorphicrecursives object to access its operations.
     * @return the Polymorphicrecursives object.
     */
    Polymorphicrecursives polymorphicrecursives();

    /**
     * Gets the Readonlypropertys object to access its operations.
     * @return the Readonlypropertys object.
     */
    Readonlypropertys readonlypropertys();

}
