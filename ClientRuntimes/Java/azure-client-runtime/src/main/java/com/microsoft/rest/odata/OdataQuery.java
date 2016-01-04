/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest.odata;

import java.util.ArrayList;
import java.util.List;

/**
 * An instance of this class handles OData query generation.
 */
public class OdataQuery {
    /** The query $filter expression. */
    private String filter;
    /** The query $orderby expression. */
    private String orderBy;
    /** The query $expand expression. */
    private String expand;
    /** The query $top value. */
    private Integer top;
    /** The query $skip value. */
    private Integer skip;
    /** Indicates whether null values in the Filter should be skipped. Default value is true. */
    private boolean skipNullFilterParameters = true;

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public boolean isSkipNullFilterParameters() {
        return skipNullFilterParameters;
    }

    public void setSkipNullFilterParameters(boolean skipNullFilterParameters) {
        this.skipNullFilterParameters = skipNullFilterParameters;
    }

    @Override
    public String toString() {
        List<String> queryStringList = new ArrayList<>();
        if (filter != null && !filter.isEmpty()) {
            queryStringList.add(String.format("$filter=%s", filter));
        }
        if (orderBy != null && !orderBy.isEmpty()) {
            queryStringList.add(String.format("$orderby=%s", orderBy));
        }
        if (expand != null && !expand.isEmpty()) {
            queryStringList.add(String.format("$expand=%s", orderBy));
        }
        if (top != null) {
            queryStringList.add(String.format("$top=%d", top));
        }
        if (skip != null) {
            queryStringList.add(String.format("$skip=%d", skip));
        }
        return String.join("%", queryStringList);
    }
}
