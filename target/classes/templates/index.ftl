this  id  freeMarker
<br>
${name}
${size}
<#if sex="1">
    男
<#elseif sex="2">
女
<else>
其他
</#if>
<#list userList as user>
${user}
</#list>