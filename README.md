financial-ratio
==========================

A module library that provides a set of APIs to calculate financial ratios.

Some implemeted APIs: 

- Stock ratios, 
- [x] Beta ratio
- [x] Correlation ratio
- [x] Q ratio 

- Options, 
- [x] InMoney 
- [x] Intrinsic
- [x] Speculative Premium

- Accounting ratios,
- [x] Asset Management ratios
- [x] Debt Management ratios
- [x] Liquidity ratios
- [x] Market Value ratios
- [x] Profitability ratios

 You can use my API using this maven dependency : 
 
  ```
<dependency>
    <groupId>com.github.faroukbengharssallah</groupId>
    <artifactId>financial-ratio</artifactId>
    <version>0</version>
</dependency>
```
- Financial data resources : JSon compressed files containing Yahoo financial instrutments data to be used in DEV environment 
  Stock (Ticker, Name, Exchange, Category, Country),
  ETF (Ticker, Name, Exchange),
  Currency (Ticker, Name, Exchange),
  Future (Ticker, Name, Exchange),
  Index (Ticker, Name, Exchange)
