package tc.bank;

import galaxy.ide.tech.cpt.Component;
import galaxy.ide.tech.cpt.ComponentGroup;
import galaxy.ide.tech.cpt.Return;
import galaxy.ide.tech.cpt.Returns;
import cn.com.agree.afa.svc.javaengine.TCResult;

/**
 * qwer
 * 
 * @date 2019-08-29 15:19:32
 */
@ComponentGroup(level = "银行", groupName = "qwer", projectName = "bank", appName = "bank")
public class Mwer {

	/**
	 * @category mmkk
	 * @return 0 失败<br/>
	 *         1 成功<br/>
	 */
	@Returns(returns = { @Return(id = "0", desp = "失败"),
			@Return(id = "1", desp = "成功") })
	@Component(label = "mmkk", style = "判断型", type = "同步组件", comment = "mmmkk", author = "testAuthor", date = "2019-08-29 03:19:46")
	public static TCResult B_mmkk() {
		return TCResult.newSuccessResult();
	}

}
