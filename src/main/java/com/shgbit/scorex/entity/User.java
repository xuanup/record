package com.shgbit.scorex.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.apache.commons.lang.ArrayUtils;

import java.util.Collection;
import java.util.Date;

@Data
@Table(name = "user")
public class User implements UserDetails {
    private static final long serialVersionUID=1L;
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;
    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  name;
    @Column(name = "password",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  password;
    @Column(name = "create_time",type = MySqlTypeConstant.DATETIME)
    private Date create_time;
    @Column(name = "update_time",type = MySqlTypeConstant.DATETIME)
    private Date    update_time;
    @Column(name = "update_user",type = MySqlTypeConstant.VARCHAR,length = 111)
    private Date    update_user;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
