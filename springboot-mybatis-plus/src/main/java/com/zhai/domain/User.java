package com.zhai.domain;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor(access=AccessLevel.PRIVATE,force=true)
@RequiredArgsConstructor
@TableName(value="users")
@Scope("session")
public class User implements UserDetails {
	 private static final long serialVersionUID = 1L;
	    
//		@IsKey // actable主键注解
//		@IsAutoIncrement // 自增
//		@Column
		@TableId(value = "id", type = IdType.AUTO)
	    private Long id;
	    
	    private final String username;
	    private final String password;
	    @TableField(value = "fullname")
	    private final String fullname;
	    private final String street;
	    private final String city;
	    private final String state;
	    private final String zip;
	    private final String phoneNumber;
	
	 /*getAuthorities() 方法应该返回授予用户的权限集合。各种 isXXXexpired() 方法返回一个布尔值，指示用户的帐户是否已启用或过期。
	  * 对于 User 实体，getAuthorities() 方法仅返回一个集合，该集合指示所有用户将被授予 ROLE_USER 权限。
	  * 而且，至少现在，Taco Cloud 还不需要禁用用户，所以所有的 isXXXexpired() 方法都返回 true 来表示用户处于活动状态。
	  *    
	  */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USERS"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
