package ${package}.${moduleName}.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ${package}.${moduleName}.entity.WmsWareSkuEntity;
import ${package}.${moduleName}.service.WmsWareSkuService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 商品库存
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
@RestController
@RequestMapping("${moduleName}/wmswaresku")
public class WmsWareSkuController {
    @Autowired
    private WmsWareSkuService wmsWareSkuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("${moduleName}:wmswaresku:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsWareSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("${moduleName}:wmswaresku:info")
    public R info(@PathVariable("id") unknowType id){
		WmsWareSkuEntity wmsWareSku = wmsWareSkuService.getById(id);

        return R.ok().put("wmsWareSku", wmsWareSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("${moduleName}:wmswaresku:save")
    public R save(@RequestBody WmsWareSkuEntity wmsWareSku){
		wmsWareSkuService.save(wmsWareSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("${moduleName}:wmswaresku:update")
    public R update(@RequestBody WmsWareSkuEntity wmsWareSku){
		wmsWareSkuService.updateById(wmsWareSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("${moduleName}:wmswaresku:delete")
    public R delete(@RequestBody unknowType[] ids){
		wmsWareSkuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
