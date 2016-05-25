// Copyright (c) Microsoft Open Technologies, Inc. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

using Microsoft.Rest.Generator.ClientModel;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Rest.Generator.Java.TemplateModels;
using Microsoft.Rest.Generator.Utilities;
using Microsoft.Rest.Generator.Azure;

namespace Microsoft.Rest.Generator.Java.Azure.Fluent
{
    public class ENBFParser
    {
        public static Chain Parse(string grammar)
        {
            var root = new Chain();
            root.Entrance = new Interface();
            root.Entrance.Name = "DefinitionBlank";
            // Get grammar name & actual grammar
            var meta = grammar.Split(new string[] { "::=" }, StringSplitOptions.RemoveEmptyEntries);
            if (meta.Length != 2)
            {
                // Wrong grammar
                throw new ArgumentException("Invalid grammar");
            }
            root.Name = meta[0].Trim();
            grammar = grammar.Trim();

            var chainStack = new Stack<Chain>();
            

            return ParseActual(grammar, root);
        }

        private static void BreakParenthesis(string grammar, ref List<string> groupedGrammar) {
            int blockStart = -1;
            bool inString = false;
            int pos = 0;
            while (pos < grammar.Length)
            {
                if (grammar[pos] == '\'')
                {
                    inString = !inString;
                    ++pos;
                }
                else if (!inString && grammar[pos] == '(')
                {
                    blockStart = pos;
                    int level = 0;
                    while (grammar[++pos] != ')' || level != 0)
                    {
                        if (pos == '(')
                        {
                            ++level;
                        }
                        else if (pos == ')')
                        {
                            --level;
                        }
                    }
                    var subGrammar = grammar.Substring(blockStart + 1, pos - blockStart - 1);
                    groupedGrammar.Add(subGrammar);
                    // xxx (yyy) zzz will be replaced with xxx {1} zzz
                    grammar.Replace("(" + subGrammar + ")", "{" + (groupedGrammar.Count - 1) + "}");
                    pos -= subGrammar.Length - 2 + (int) Math.Floor(Math.Log10(groupedGrammar.Count - 1));
                }
            }
        }

        private static Chain ParseActual(string grammar, Chain chain)
        {
            List<string> subGrammars = new List<string>();
            bool inParen = false;
            int pos = 0;
            while (pos < grammar.Length)
            {
                // ' ' : mark as spaced, move on

                // '\'': create an interface if after space, create a method, find closing quote, move on

                // '|' : reset spaced, trim, move on
                
                // ' 
                if (!inParen && grammar[pos] == '(')
                {
                    inParen = true;
                }
            }
            return chain;
        }
    }
}
