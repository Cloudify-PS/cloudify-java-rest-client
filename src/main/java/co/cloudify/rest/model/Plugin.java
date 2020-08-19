package co.cloudify.rest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Plugin implements Serializable {
    /** Serialization UID. */
    private static final long serialVersionUID = 1L;

    @XmlElement
    private String id;
    @XmlElement(name = "distribution_release")
    private String distributionRelease;
    @XmlElement(name = "uploaded_at")
    private Date uploadedAt;
    @XmlElement(name = "package_name")
    private String packageName;
    @XmlElement(name = "tenant_name")
    private String tenantName;
    @XmlElement(name = "package_version")
    private String packageVersion;
    @XmlElement(name = "created_by")
    private String createdBy;
    @XmlElement(name = "supported_platform")
    private String supportedPlatform;
    @XmlElement(name = "supported_py_versions")
    private List<String> supportedPythonVersions;
    @XmlElement
    private String visibility;
    @XmlElement
    private String distribution;
    @XmlElement(name = "distribution_version")
    private String distributionVersion;
    @XmlElement(name = "yaml_url_path")
    private String yamlUrlPath;
    @XmlElement(name = "archive_name")
    private String archiveName;
    @XmlElement(name = "excluded_wheels")
    private List<String> excludedWheels;
    @XmlElement(name = "package_source")
    private String packageSource;
    @XmlElement(name = "private_resource")
    private Boolean privateResource;
    @XmlElement(name = "wheels")
    private List<String> wheels;
    @XmlElement(name = "file_server_path")
    private String fileServerPath;
    @XmlElement(name = "resource_availability")
    private ResourceAvailability resourceAvailability;

    public String getPackageName() {
        return packageName;
    }
    
    public String getPackageVersion() {
        return packageVersion;
    }
    
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("packageName", packageName)
                .append("packageVersion", packageVersion)
                .append("supportedPlatform", supportedPlatform)
                .append("distributionRelease", distributionRelease)
                .append("distributionVersion", distributionVersion)
                .append("supportedPythonVersions", supportedPythonVersions)
                .toString();
    }
}
