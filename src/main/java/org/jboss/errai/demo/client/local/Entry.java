/**
 * Copyright (C) 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.demo.client.local;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;

public class Entry implements EntryPoint {

  private final DivElement display = Document.get().createDivElement();

  private final EmailAnchor anchorSubtype = (EmailAnchor) (Object) Document.get().createElement("a");

  private final Anchor anchor = (Anchor) Document.get().createElement("a");

  @Override
  public void onModuleLoad() {
    Document.get().getBody().appendChild(display);

    try {
      anchor.getTextContent();
      println("Successfully accessed textContent propery of anchor.");
    } catch (final Throwable t) {
      final String msg = "Failed to access textContent property of anchor.";
      println(msg + " See console for details.");
      throw t;
    }
    try {
      anchorSubtype.getTextContent();
      println("Successfully accessed textContent propery of anchor subtype.");
    } catch (final Throwable t) {
      final String msg = "Failed to access textContent property of anchor subtype.";
      println(msg + " See console for details.");
      throw t;
    }
  }

  private void println(final String text) {
    final DivElement line = Document.get().createDivElement();
    line.setInnerText(text);
    display.appendChild(line);
  }

}
