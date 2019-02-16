package njhk.wisdom.web.bean.entity.resources;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@ApiModel(description = "账号信息")
@Getter
@Setter
@ToString
public class Syuser extends DataEntity<Syuser> implements UserDetails {

    private String ip;// 此属性不存数据库，虚拟属性
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "创建时间")
    private Date createdatetime;
    @ApiModelProperty(value = "修改时间")
    private Date updatedatetime;
    @ApiModelProperty(value = "登录名")
    private String loginname;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "用户姓名，服务人员姓名")
    private String name;
    @ApiModelProperty(value = "性别")
    private String sex;
    @ApiModelProperty(value = "年龄")
    private Integer age;
    @ApiModelProperty(value = "照片")
    private String photo;
    @ApiModelProperty(value = "")
    private int dog = 1;
    @ApiModelProperty(value = "登录状态0.未登录1.已登录")
    private String status;
    @ApiModelProperty(value = "最后轮询时间")
    private Date logintime;
    @ApiModelProperty(value = "是否有其他人登录0.没有其他人登录1.有其他人登录")
    private String states;
    @ApiModelProperty(value = "同步码")
    private String sysEndCood;
    private String usertype;
    private List<SyRole> roles;
    private boolean enabled;

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (SyRole role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }
    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }
    @JsonIgnore
    @Override
    public String getUsername() {
        return loginname;
    }
    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return enabled;
    }

  /*  private Set<Syorganization> syorganizations = new HashSet<Syorganization>(0);

    private Set<Syrole> syroles = new HashSet<Syrole>(0);*/
}
