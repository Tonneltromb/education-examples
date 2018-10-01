<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <body>
                <table border="1">
                    <tr>
                        <th>Title</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="catalog/cd">
                       <xsl:choose>
                           <xsl:when test="price &gt; 10">
                               <tr>
                                   <td><xsl:value-of select="title"/></td>
                                   <td bgcolor="red"><xsl:value-of select="artist" /></td>
                               </tr>
                           </xsl:when>
                           <xsl:when test="string-length(country) &gt; 2">
                               <tr>
                                   <td><xsl:value-of select="title"/></td>
                                   <td bgcolor="blue"><xsl:value-of select="artist" /></td>
                               </tr>
                           </xsl:when>
                           <xsl:otherwise>
                               <tr>
                                   <td><xsl:value-of select="title"/></td>
                                   <td><xsl:value-of select="artist" /></td>
                               </tr>
                           </xsl:otherwise>
                       </xsl:choose>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>