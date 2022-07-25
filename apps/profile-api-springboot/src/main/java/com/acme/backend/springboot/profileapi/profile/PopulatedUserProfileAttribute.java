package com.acme.backend.springboot.profileapi.profile;

import com.acme.backend.springboot.profileapi.profile.schema.UserProfileAttribute;
import lombok.Data;

@Data
public class PopulatedUserProfileAttribute {

    private String name;

    private String claimName;

    private String type;

    private boolean required;

    private boolean readonly;

    private String value;

    public PopulatedUserProfileAttribute(UserProfileAttribute source, String value) {
        this.name = source.getName();
        this.claimName = source.toClaimName();
        this.type = source.getType();
        this.readonly = source.isRequired();
        this.readonly = source.isReadonly();
        this.value = value;
    }

}
