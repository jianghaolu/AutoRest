﻿// Copyright (c) Microsoft Open Technologies, Inc. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.Rest.Generator.Java.TemplateModels;
using Microsoft.Rest.Generator.Azure;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.Utilities;
using System.Globalization;

namespace Microsoft.Rest.Generator.Java.Azure.Fluent
{
    public class AzureFluentResourceTemplateModel : AzureFluentModelTemplateModel
    {
        public AzureFluentResourceTemplateModel(CompositeTypeModel source, ServiceClient serviceClient)
            : base(source, serviceClient)
        {
        }
        
    }
}