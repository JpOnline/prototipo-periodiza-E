(ns cljc.java-time.month (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Month]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time Month])))
(def may (. java.time.Month -MAY))
(def december (. java.time.Month -DECEMBER))
(def june (. java.time.Month -JUNE))
(def september (. java.time.Month -SEPTEMBER))
(def february (. java.time.Month -FEBRUARY))
(def january (. java.time.Month -JANUARY))
(def november (. java.time.Month -NOVEMBER))
(def august (. java.time.Month -AUGUST))
(def july (. java.time.Month -JULY))
(def march (. java.time.Month -MARCH))
(def october (. java.time.Month -OCTOBER))
(def april (. java.time.Month -APRIL))
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Month this2704 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2705] (.range this2704 java-time-temporal-TemporalField2705)))
(clojure.core/defn values {:arglists (quote (["java.time.Month"]))} (^"java.lang.Class" [] (. java.time.Month values)))
(clojure.core/defn value-of {:arglists (quote (["java.time.Month" "java.lang.String"] ["java.time.Month" "java.lang.Class" "java.lang.String"]))} (^java.time.Month [^java.lang.String java-lang-String2706] (. java.time.Month valueOf java-lang-String2706)) (^java.lang.Enum [^java.lang.Class java-lang-Class2707 ^java.lang.String java-lang-String2708] (. java.time.Month valueOf java-lang-Class2707 java-lang-String2708)))
(clojure.core/defn of {:arglists (quote (["java.time.Month" "int"]))} (^java.time.Month [^java.lang.Integer int2709] (. java.time.Month of int2709)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2710] (.ordinal this2710)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^java.time.Month [^java.time.Month this2711] (.firstMonthOfQuarter this2711)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2712] (.minLength this2712)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this2713 ^long long2714] (.plus this2713 long2714)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Month this2715 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery2716] (.query this2715 java-time-temporal-TemporalQuery2716)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this2717] (.toString this2717)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this2718 ^java.lang.Boolean boolean2719] (.firstDayOfYear this2718 boolean2719)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this2720 ^long long2721] (.minus this2720 long2721)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.Month this2722 ^java.time.format.TextStyle java-time-format-TextStyle2723 ^java.util.Locale java-util-Locale2724] (jti/getter displayName this2722 java-time-format-TextStyle2723 java-util-Locale2724)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2725] (jti/getter value this2725)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2726] (.maxLength this2726)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this2727] (.name this2727)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^java.time.Month this2728 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2729] (.getLong this2728 java-time-temporal-TemporalField2729)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this2730 ^java.lang.Boolean boolean2731] (.length this2730 boolean2731)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^java.time.Month this2732] (jti/getter declaringClass this2732)))
(clojure.core/defn from {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalAccessor"]))} (^java.time.Month [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor2733] (. java.time.Month from java-time-temporal-TemporalAccessor2733)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.Month this2734 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2735] (.isSupported this2734 java-time-temporal-TemporalField2735)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this2736] (.hashCode this2736)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Month this2737 ^java.time.temporal.Temporal java-time-temporal-Temporal2738] (.adjustInto this2737 java-time-temporal-Temporal2738)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Object"] ["java.time.Month" "java.lang.Enum"]))} (^java.lang.Integer [this2739 G__2740] #? (:cljs (.compareTo ^java.time.Month this2739 G__2740) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__2740)) (clojure.core/let [G__2740 ^"java.lang.Object" G__2740] (.compareTo ^java.time.Month this2739 G__2740)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__2740)) (clojure.core/let [G__2740 ^"java.lang.Enum" G__2740] (.compareTo ^java.time.Month this2739 G__2740)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Month this2741 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2742] (.get this2741 java-time-temporal-TemporalField2742)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Month this2743 ^java.lang.Object java-lang-Object2744] (.equals this2743 java-lang-Object2744)))
