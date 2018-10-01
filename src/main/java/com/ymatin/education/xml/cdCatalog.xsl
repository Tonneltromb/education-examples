<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <body>
                <table border="1">
                    <tr>
                        <th>Title</th>
                        <th>Artist</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="catalog/cd">
                    <!--<xsl:for-each select="catalog/cd[artist='Bob Dylan']">-->
                        <xsl:sort select="artist"/>
                        <xsl:if test="price &gt; 10">
                    <tr>
                        <td><xsl:value-of select="title" /></td>
                        <td><xsl:value-of select="artist" /></td>
                        <td><xsl:value-of select="price" /></td>
                    </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>