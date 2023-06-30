# Java Stream Utils

This repository has exemples to use Java Stream and lambda

## requirements
 - Java 8+
 - IDE like as IntellJ or Eclipse

## 1 Operations

#### sample to create Stream instances

[Show Java Code](operations/CreateInstanceOfStream.java)

#### sample to use the method .forEach

[Show Java Code](operations/StreamForEachExemple.java)

#### sample to use the method .collect (trnasform stream in other collection etc)

[Show Java Code](operations/StreamCollectSample.java)

#### sample to use method .toArray (transform stream in array)

[Show Java Code](operations/StreamToArraySample.java)

### sample to use method .map to use a function to transform data

[Show Java Code](operations/StreamMapSample.java)

### sample to use method .flatMap to aggregate many list at one list

[Show Java Code](operations/StreamFlatMapSample.java)

### sample to use method .flatMap to aggregate many list at one list with Custon Object

[Show Java Code](operations/StreamFlatMapCustonObjectSample.java)

### sample to use the methods .count .distinct .sorted

[Show Java Code](operations/StreamDistinctCountSortSample.java)

### sample to use the method .filter with Predicate (result boolean)

[Show Java Code](operations/StreamFilterSample.java)

### sample to use the method reduce sum, max, min all elements

[Show Java Code](operations/StreamReduceSample.java)

### sample to use the methods .anyMatch allMatch and noneMatch

[Show Java Code](operations/StreamMatchSample.java)

### sample to use sum and avg terminal operation

[Show Java Code](terminal/StreamSumAvgSample.java)

## 2 Sample wiht operations Terminated

### sample to use Collector.joining terminal operation -> concat all elements in on string

[Show Java Code](terminal/StreamJoiningSample.java)

### sample to use Collector.counting terminal operation count elements in stream

[Show Java Code](terminal/StremaCountSample.java)

### sample to use Collector.maxBy and Collector.minBy

[Show Java Code](terminal/StreamMinMaxSample.java)

### sample to use Collector.groupingBy age show all information

[Show Java Code](terminal/StreamGrupingBySample.java)

### sample to use Collector.groupingBy age show count occurrences

[Show Java Code](terminal/StreamGrupingBySample2.java)

### sample to use Collector.groupingBy age show show List of names 

[Show Java Code](terminal/StreamGrupingBySample3.java)

### sample to use Collector.partitioningBy with integrs

[Show Java Code](terminal/StreamPartitioningBySample.java)

### sample to use Collector.partitioningBy with strins

[Show Java Code](terminal/StreamPartitioningBySample2.java)

## 3 samples with numerical Stream IntStream LongStream and DoubleStream

### sample to use NumericStream range tangeClose count and ForEach methods

[Show Java Code](numeric/NumericStreamRangeRangeCloseCountForEach.java)

### sample to use NumericStream sum max min average methods

[Show Java Code](numeric/NumericStreamSumMaxMinAverageSample.java)

### sample to use NumericStream boxing and unboxing with mapToInt method

[Show Java Code](numeric/NumericSreamBoxingUnboxingMapToInt.java)
