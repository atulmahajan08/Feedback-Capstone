package com.cts.feedback.event.entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;


@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-06T15:35:34.885+05:30[Asia/Calcutta]")
public class Role   {
  @JsonProperty("ro_id")
  private Integer id = null;

  @JsonProperty("ro_name")
  private String rolename = null;

  public Role id(Integer id) {
    this.id = id;
    return this;
  }

  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Role rolename(String rolename) {
    this.rolename = rolename;
    return this;
  }

  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.rolename, role.rolename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rolename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rolename: ").append(toIndentedString(rolename)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
