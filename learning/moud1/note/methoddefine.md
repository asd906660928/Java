# 定义方法的完整格式
    修饰符 返回类型 方法名称（参数类型 参数名称，...）{
    
                方法体
                return返回值
    }
 
 - 修饰符：现阶段的固定写法public static
 - 返回值类型：也就是方法最终产生的结果类型
 - 方法名称：小驼峰
 - 参数类型：进入方法的数据是什么类型
 - 参数名称：进入方法的数据对应的变量名称

    
    ps：参数如果有多个，使用逗号进行分隔
 - 方法体：方法需要做的事情
 - return：
 
    第一个作用：停止当前方法
    
    第二个作用：将后面的结果数据返回给<u>调用处</u>
    
    返回值：方法执行完成后产生的数据结果
    
    
    注意：return后面的“返回值”必须和方法名称前面的“返回值类型”保持对应

-----

#定义一个两个数字相加的方法
###三要素：
- 返回值类型：int
- 方法名称：sum
- 参数列表：int a, int b 
---
#方法的三种调用格式
1 .单独调用

2 .打印调用

3 .赋值调用

---
    public class Demo02MethodDefine {
        public static void main(String[] args) {
            
            // 单独调用
            sum(10, 20);
            
            // 打印调用
            System.out.println(sum(15, 10));
            
            // 赋值调用
            int number = sum(20, 30);
            System.out.println("变量值为：" + number);
            
        }
        
        public static int sum (int a, int b){
            System.out.println("调用成功");
            int result = a + b;
            return result;
        }
    }



### 注意：之前学习的方法，返回值类型固定写为void，这种方法只能单独调用，不能打印调用或者赋值调用。