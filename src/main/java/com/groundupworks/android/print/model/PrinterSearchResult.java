/*
 * Copyright (C) 2014 David Marques.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.groundupworks.android.print.model;

import java.util.List;

/**
 * Defines a basic interface with accessor methods for a print search result.
 *
 * @see com.groundupworks.android.print.GoogleCloudPrint#getPrinters(String)
 * @see com.groundupworks.android.print.gson.model.GsonPrinterSearchResult
 * @see com.groundupworks.android.print.gson.GsonPrinterSearchResultOperator
 */
public interface PrinterSearchResult {

    public static final String PRINTERS = "printers";

    public List<Printer> getPrinters();

}
