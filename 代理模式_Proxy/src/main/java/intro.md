# 实际使用
    在保存编目时，保存完成直接执行清洗任务。
    项目系统先前的清洗流程是：
        数据源 --清洗--> 编目
    新需求修改为：
        数据源 -> 保存一份清洗前的副本到数据库 --清洗--> 编目
    
    由于修改原来的代码复杂度较高，此处采用了 Aop 来实现
    1.原版的清洗是，保存了清洗任务就直接执行，只执行一个清洗任务。
    2.现在加了一个前置通知，将 datax Job 文件在进行清洗前，生成一个新的 datax Job 文件，
      将原来的 job 文件的 target 修改为导入到副本数据库，生成的新 job 文件，source 为备份数据库，target 是旧 job 文件中的 target。
      通过 Aop 实现新需求，在不修改原来的代码的情况下，实现了新需求，符合开闭原则。