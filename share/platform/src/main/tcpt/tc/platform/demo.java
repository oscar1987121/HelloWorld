package tc.platform;

import galaxy.ide.tech.cpt.Component;
import galaxy.ide.tech.cpt.ComponentGroup;
import galaxy.ide.tech.cpt.Return;
import galaxy.ide.tech.cpt.Returns;
import cn.com.agree.afa.svc.javaengine.TCResult;

/**
 * demo
 * 
 * @date 2019-08-08 10:59:33
 */
@ComponentGroup(level = "平台", groupName = "cate", projectName = "platform", appName = "platform")
public class demo {

	/**
	 * @category hello
	 * @return 0 失败<br/>
	 *         1 成功<br/>
	 */
	@Returns(returns = { @Return(id = "0", desp = "失败"),
			@Return(id = "1", desp = "成功") })
	@Component(label = "hello", style = "判断型", type = "同步组件", comment = "hello", author = "testAuthor", date = "2019-08-08 10:59:46")
	public static TCResult P_hello() {
		return TCResult.newSuccessResult();
	}

}
