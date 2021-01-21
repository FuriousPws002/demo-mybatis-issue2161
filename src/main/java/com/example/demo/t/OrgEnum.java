package com.example.demo.t;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrgEnum {

    //org info
    AB("000001", "ABorg"),
    CD("000002", "CDorg");

    private final String code;
    private final String name;

    //constants

    public static final String AB_ORG_CODE = AB.getCode();
    public static final String CD_ORG_CODE = CD.getCode();

    public static final String D1_DEPARTMENT_CODE = OrgEnum.DepartmentEnum.D1_DEPARTMENT.getCode();

    @Getter
    @RequiredArgsConstructor
    public enum DepartmentEnum {

        // department  info
        D1_DEPARTMENT(OrgEnum.AB, "D001", "D001Info..."),
        D2_DEPARTMENT(OrgEnum.AB, "D002", "D002Info..."),
        D3_DEPARTMENT(OrgEnum.CD, "D003", "D003Info..."),
        ;

        private final OrgEnum org;
        private final String code;
        private final String name;
    }
}