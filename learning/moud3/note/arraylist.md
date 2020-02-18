# ArrayList
- 数组长度不能改变
- arrayList长度可以改变。

- 对于arrayList来说，有一个尖括号<E>代表泛型。

    泛型：也就是装在集合里的所有元素，都是相同的类型。
    
    注意：泛型只能是引用类型，不能是基本类型。
    
##ArrayList常用方法：

public boolean add(E e):向集合中添加元素，类型和泛型一致。

public E get(索引值)：获取集合中的元素

public E remove(索引值)：删除集合中的元素

public int size():获取长度，返回值是集合里元素的个数。

---
- 如果想向集合里存储基本类型数据，需要使用基本类型对应的“包装类”



|  基本类型   | 包装类（属于引用类型，包装类都位于java.lang下）  |
|  ----  | ----  |
| byte  | Byte |
| short  | Short |
| int  | Integer [特殊] |
| long  | Long |
| float  | Float |
| double  | Double |
| char  | Character   [特殊] |
| boolean  | Boolean |
