package DeptMapperTest;

import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.atguigu.mybatis.utils.UtilsMapper;
import org.apache.ibatis.session.SqlSession;

public class Test {
    //查询指定表中数据
    @org.junit.Test
    public void test08(){
        SqlSession mapper = UtilsMapper.getMapper();
        EmpMapper mapper1 = mapper.getMapper(EmpMapper.class);
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEidEqualTo(2);
        System.out.println(mapper1.selectByExample(empExample));

    }
}
