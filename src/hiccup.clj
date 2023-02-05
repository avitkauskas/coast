(ns hiccup
  (:require [coast.potemkin.namespaces :as namespaces]
            [hiccup2.core]
            [hiccup.page]
            [hiccup.element])
  (:refer-clojure :exclude [update]))

(namespaces/import-vars
  [hiccup.page
   html5]

  [hiccup.element
   link-to]

  [hiccup2.core
   raw
   html])
