package com.avenueinfotech.daggerexample.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by suken on 08-12-2016.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PreActivity {
}
