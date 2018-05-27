<#if ejb3?if_exists>
    <#if pojo.isComponent()>
    @${pojo.importType("javax.persistence.Embeddable")}
    <#else>
    @${pojo.importType("javax.persistence.Entity")}
        <#assign entity = pojo.getDeclarationName()>
        <#assign prefix = "">
        <#if clazz.table.schema?exists && clazz.table.schema?lower_case != "akfish">
            <#assign prefix = "${clazz.table.schema}."?lower_case?replace("akfish","")?replace("_","")>
        </#if>(name="${prefix}${entity}")
    @${pojo.importType("javax.persistence.Table")}(name="${clazz.table.name}"
        <#if clazz.table.schema?exists>
        ,schema="${clazz.table.schema}"
        </#if><#if clazz.table.catalog?exists>
    ,catalog="${clazz.table.catalog}"
    </#if>
        <#assign uniqueConstraint=pojo.generateAnnTableUniqueConstraint()>
        <#if uniqueConstraint?has_content>
        , uniqueConstraints = ${uniqueConstraint}
        </#if>)
    </#if>
</#if>