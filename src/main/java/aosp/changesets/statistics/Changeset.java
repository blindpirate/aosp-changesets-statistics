package aosp.changesets.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "project",
        "branch",
        "attention_set",
        "hashtags",
        "change_id",
        "subject",
        "status",
        "created",
        "updated",
        "submitted",
        "submitter",
        "insertions",
        "deletions",
        "total_comment_count",
        "unresolved_comment_count",
        "has_review_started",
        "submission_id",
        "meta_rev_id",
        "_number",
        "owner",
        "labels",
        "removable_reviewers",
        "reviewers",
        "pending_reviewers",
        "requirements"
})
public class Changeset {

    @JsonProperty("id")
    private String id;
    @JsonProperty("project")
    private String project;
    @JsonProperty("branch")
    private String branch;
    @JsonProperty("attention_set")
    private Changeset.AttentionSet attentionSet;
    @JsonProperty("hashtags")
    private List<String> hashtags = new ArrayList<String>();
    @JsonProperty("change_id")
    private String changeId;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("status")
    private String status;
    @JsonProperty("created")
    private String created;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("submitted")
    private String submitted;
    @JsonProperty("submitter")
    private Changeset.Submitter submitter;
    @JsonProperty("insertions")
    private Long insertions;
    @JsonProperty("deletions")
    private Long deletions;
    @JsonProperty("total_comment_count")
    private Long totalCommentCount;
    @JsonProperty("unresolved_comment_count")
    private Long unresolvedCommentCount;
    @JsonProperty("has_review_started")
    private Boolean hasReviewStarted;
    @JsonProperty("submission_id")
    private String submissionId;
    @JsonProperty("meta_rev_id")
    private String metaRevId;
    @JsonProperty("_number")
    private Long number;
    @JsonProperty("owner")
    private Changeset.Owner owner;
    @JsonProperty("labels")
    private Changeset.Labels labels;
    @JsonProperty("removable_reviewers")
    private List<Changeset.RemovableReviewer> removableReviewers = new ArrayList<Changeset.RemovableReviewer>();
    @JsonProperty("reviewers")
    private Changeset.Reviewers reviewers;
    @JsonProperty("pending_reviewers")
    private Changeset.PendingReviewers pendingReviewers;
    @JsonProperty("requirements")
    private List<Object> requirements = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Changeset() {
    }

    /**
     *
     * @param submitter
     * @param hashtags
     * @param insertions
     * @param deletions
     * @param subject
     * @param project
     * @param totalCommentCount
     * @param changeId
     * @param branch
     * @param number
     * @param submissionId
     * @param removableReviewers
     * @param pendingReviewers
     * @param id
     * @param metaRevId
     * @param owner
     * @param hasReviewStarted
     * @param requirements
     * @param created
     * @param attentionSet
     * @param reviewers
     * @param labels
     * @param submitted
     * @param unresolvedCommentCount
     * @param updated
     * @param status
     */
    public Changeset(String id, String project, String branch, Changeset.AttentionSet attentionSet, List<String> hashtags, String changeId, String subject, String status, String created, String updated, String submitted, Changeset.Submitter submitter, Long insertions, Long deletions, Long totalCommentCount, Long unresolvedCommentCount, Boolean hasReviewStarted, String submissionId, String metaRevId, Long number, Changeset.Owner owner, Changeset.Labels labels, List<Changeset.RemovableReviewer> removableReviewers, Changeset.Reviewers reviewers, Changeset.PendingReviewers pendingReviewers, List<Object> requirements) {
        super();
        this.id = id;
        this.project = project;
        this.branch = branch;
        this.attentionSet = attentionSet;
        this.hashtags = hashtags;
        this.changeId = changeId;
        this.subject = subject;
        this.status = status;
        this.created = created;
        this.updated = updated;
        this.submitted = submitted;
        this.submitter = submitter;
        this.insertions = insertions;
        this.deletions = deletions;
        this.totalCommentCount = totalCommentCount;
        this.unresolvedCommentCount = unresolvedCommentCount;
        this.hasReviewStarted = hasReviewStarted;
        this.submissionId = submissionId;
        this.metaRevId = metaRevId;
        this.number = number;
        this.owner = owner;
        this.labels = labels;
        this.removableReviewers = removableReviewers;
        this.reviewers = reviewers;
        this.pendingReviewers = pendingReviewers;
        this.requirements = requirements;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(String project) {
        this.project = project;
    }

    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @JsonProperty("attention_set")
    public Changeset.AttentionSet getAttentionSet() {
        return attentionSet;
    }

    @JsonProperty("attention_set")
    public void setAttentionSet(Changeset.AttentionSet attentionSet) {
        this.attentionSet = attentionSet;
    }

    @JsonProperty("hashtags")
    public List<String> getHashtags() {
        return hashtags;
    }

    @JsonProperty("hashtags")
    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    @JsonProperty("change_id")
    public String getChangeId() {
        return changeId;
    }

    @JsonProperty("change_id")
    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("submitted")
    public String getSubmitted() {
        return submitted;
    }

    @JsonProperty("submitted")
    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    @JsonProperty("submitter")
    public Changeset.Submitter getSubmitter() {
        return submitter;
    }

    @JsonProperty("submitter")
    public void setSubmitter(Changeset.Submitter submitter) {
        this.submitter = submitter;
    }

    @JsonProperty("insertions")
    public Long getInsertions() {
        return insertions;
    }

    @JsonProperty("insertions")
    public void setInsertions(Long insertions) {
        this.insertions = insertions;
    }

    @JsonProperty("deletions")
    public Long getDeletions() {
        return deletions;
    }

    @JsonProperty("deletions")
    public void setDeletions(Long deletions) {
        this.deletions = deletions;
    }

    @JsonProperty("total_comment_count")
    public Long getTotalCommentCount() {
        return totalCommentCount;
    }

    @JsonProperty("total_comment_count")
    public void setTotalCommentCount(Long totalCommentCount) {
        this.totalCommentCount = totalCommentCount;
    }

    @JsonProperty("unresolved_comment_count")
    public Long getUnresolvedCommentCount() {
        return unresolvedCommentCount;
    }

    @JsonProperty("unresolved_comment_count")
    public void setUnresolvedCommentCount(Long unresolvedCommentCount) {
        this.unresolvedCommentCount = unresolvedCommentCount;
    }

    @JsonProperty("has_review_started")
    public Boolean getHasReviewStarted() {
        return hasReviewStarted;
    }

    @JsonProperty("has_review_started")
    public void setHasReviewStarted(Boolean hasReviewStarted) {
        this.hasReviewStarted = hasReviewStarted;
    }

    @JsonProperty("submission_id")
    public String getSubmissionId() {
        return submissionId;
    }

    @JsonProperty("submission_id")
    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    @JsonProperty("meta_rev_id")
    public String getMetaRevId() {
        return metaRevId;
    }

    @JsonProperty("meta_rev_id")
    public void setMetaRevId(String metaRevId) {
        this.metaRevId = metaRevId;
    }

    @JsonProperty("_number")
    public Long getNumber() {
        return number;
    }

    @JsonProperty("_number")
    public void setNumber(Long number) {
        this.number = number;
    }

    @JsonProperty("owner")
    public Changeset.Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Changeset.Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("labels")
    public Changeset.Labels getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(Changeset.Labels labels) {
        this.labels = labels;
    }

    @JsonProperty("removable_reviewers")
    public List<Changeset.RemovableReviewer> getRemovableReviewers() {
        return removableReviewers;
    }

    @JsonProperty("removable_reviewers")
    public void setRemovableReviewers(List<Changeset.RemovableReviewer> removableReviewers) {
        this.removableReviewers = removableReviewers;
    }

    @JsonProperty("reviewers")
    public Changeset.Reviewers getReviewers() {
        return reviewers;
    }

    @JsonProperty("reviewers")
    public void setReviewers(Changeset.Reviewers reviewers) {
        this.reviewers = reviewers;
    }

    @JsonProperty("pending_reviewers")
    public Changeset.PendingReviewers getPendingReviewers() {
        return pendingReviewers;
    }

    @JsonProperty("pending_reviewers")
    public void setPendingReviewers(Changeset.PendingReviewers pendingReviewers) {
        this.pendingReviewers = pendingReviewers;
    }

    @JsonProperty("requirements")
    public List<Object> getRequirements() {
        return requirements;
    }

    @JsonProperty("requirements")
    public void setRequirements(List<Object> requirements) {
        this.requirements = requirements;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Changeset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("branch");
        sb.append('=');
        sb.append(((this.branch == null)?"<null>":this.branch));
        sb.append(',');
        sb.append("attentionSet");
        sb.append('=');
        sb.append(((this.attentionSet == null)?"<null>":this.attentionSet));
        sb.append(',');
        sb.append("hashtags");
        sb.append('=');
        sb.append(((this.hashtags == null)?"<null>":this.hashtags));
        sb.append(',');
        sb.append("changeId");
        sb.append('=');
        sb.append(((this.changeId == null)?"<null>":this.changeId));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("updated");
        sb.append('=');
        sb.append(((this.updated == null)?"<null>":this.updated));
        sb.append(',');
        sb.append("submitted");
        sb.append('=');
        sb.append(((this.submitted == null)?"<null>":this.submitted));
        sb.append(',');
        sb.append("submitter");
        sb.append('=');
        sb.append(((this.submitter == null)?"<null>":this.submitter));
        sb.append(',');
        sb.append("insertions");
        sb.append('=');
        sb.append(((this.insertions == null)?"<null>":this.insertions));
        sb.append(',');
        sb.append("deletions");
        sb.append('=');
        sb.append(((this.deletions == null)?"<null>":this.deletions));
        sb.append(',');
        sb.append("totalCommentCount");
        sb.append('=');
        sb.append(((this.totalCommentCount == null)?"<null>":this.totalCommentCount));
        sb.append(',');
        sb.append("unresolvedCommentCount");
        sb.append('=');
        sb.append(((this.unresolvedCommentCount == null)?"<null>":this.unresolvedCommentCount));
        sb.append(',');
        sb.append("hasReviewStarted");
        sb.append('=');
        sb.append(((this.hasReviewStarted == null)?"<null>":this.hasReviewStarted));
        sb.append(',');
        sb.append("submissionId");
        sb.append('=');
        sb.append(((this.submissionId == null)?"<null>":this.submissionId));
        sb.append(',');
        sb.append("metaRevId");
        sb.append('=');
        sb.append(((this.metaRevId == null)?"<null>":this.metaRevId));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("removableReviewers");
        sb.append('=');
        sb.append(((this.removableReviewers == null)?"<null>":this.removableReviewers));
        sb.append(',');
        sb.append("reviewers");
        sb.append('=');
        sb.append(((this.reviewers == null)?"<null>":this.reviewers));
        sb.append(',');
        sb.append("pendingReviewers");
        sb.append('=');
        sb.append(((this.pendingReviewers == null)?"<null>":this.pendingReviewers));
        sb.append(',');
        sb.append("requirements");
        sb.append('=');
        sb.append(((this.requirements == null)?"<null>":this.requirements));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.submitter == null)? 0 :this.submitter.hashCode()));
        result = ((result* 31)+((this.hashtags == null)? 0 :this.hashtags.hashCode()));
        result = ((result* 31)+((this.insertions == null)? 0 :this.insertions.hashCode()));
        result = ((result* 31)+((this.deletions == null)? 0 :this.deletions.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.project == null)? 0 :this.project.hashCode()));
        result = ((result* 31)+((this.totalCommentCount == null)? 0 :this.totalCommentCount.hashCode()));
        result = ((result* 31)+((this.changeId == null)? 0 :this.changeId.hashCode()));
        result = ((result* 31)+((this.branch == null)? 0 :this.branch.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.submissionId == null)? 0 :this.submissionId.hashCode()));
        result = ((result* 31)+((this.removableReviewers == null)? 0 :this.removableReviewers.hashCode()));
        result = ((result* 31)+((this.pendingReviewers == null)? 0 :this.pendingReviewers.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.metaRevId == null)? 0 :this.metaRevId.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.hasReviewStarted == null)? 0 :this.hasReviewStarted.hashCode()));
        result = ((result* 31)+((this.requirements == null)? 0 :this.requirements.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.attentionSet == null)? 0 :this.attentionSet.hashCode()));
        result = ((result* 31)+((this.reviewers == null)? 0 :this.reviewers.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        result = ((result* 31)+((this.submitted == null)? 0 :this.submitted.hashCode()));
        result = ((result* 31)+((this.unresolvedCommentCount == null)? 0 :this.unresolvedCommentCount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.updated == null)? 0 :this.updated.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Changeset) == false) {
            return false;
        }
        Changeset rhs = ((Changeset) other);
        return ((((((((((((((((((((((((((((this.submitter == rhs.submitter)||((this.submitter!= null)&&this.submitter.equals(rhs.submitter)))&&((this.hashtags == rhs.hashtags)||((this.hashtags!= null)&&this.hashtags.equals(rhs.hashtags))))&&((this.insertions == rhs.insertions)||((this.insertions!= null)&&this.insertions.equals(rhs.insertions))))&&((this.deletions == rhs.deletions)||((this.deletions!= null)&&this.deletions.equals(rhs.deletions))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.project == rhs.project)||((this.project!= null)&&this.project.equals(rhs.project))))&&((this.totalCommentCount == rhs.totalCommentCount)||((this.totalCommentCount!= null)&&this.totalCommentCount.equals(rhs.totalCommentCount))))&&((this.changeId == rhs.changeId)||((this.changeId!= null)&&this.changeId.equals(rhs.changeId))))&&((this.branch == rhs.branch)||((this.branch!= null)&&this.branch.equals(rhs.branch))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.submissionId == rhs.submissionId)||((this.submissionId!= null)&&this.submissionId.equals(rhs.submissionId))))&&((this.removableReviewers == rhs.removableReviewers)||((this.removableReviewers!= null)&&this.removableReviewers.equals(rhs.removableReviewers))))&&((this.pendingReviewers == rhs.pendingReviewers)||((this.pendingReviewers!= null)&&this.pendingReviewers.equals(rhs.pendingReviewers))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.metaRevId == rhs.metaRevId)||((this.metaRevId!= null)&&this.metaRevId.equals(rhs.metaRevId))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.hasReviewStarted == rhs.hasReviewStarted)||((this.hasReviewStarted!= null)&&this.hasReviewStarted.equals(rhs.hasReviewStarted))))&&((this.requirements == rhs.requirements)||((this.requirements!= null)&&this.requirements.equals(rhs.requirements))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.attentionSet == rhs.attentionSet)||((this.attentionSet!= null)&&this.attentionSet.equals(rhs.attentionSet))))&&((this.reviewers == rhs.reviewers)||((this.reviewers!= null)&&this.reviewers.equals(rhs.reviewers))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))))&&((this.submitted == rhs.submitted)||((this.submitted!= null)&&this.submitted.equals(rhs.submitted))))&&((this.unresolvedCommentCount == rhs.unresolvedCommentCount)||((this.unresolvedCommentCount!= null)&&this.unresolvedCommentCount.equals(rhs.unresolvedCommentCount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.updated == rhs.updated)||((this.updated!= null)&&this.updated.equals(rhs.updated))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars"
    })
    public static class Approved {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar3> avatars = new ArrayList<Changeset.Avatar3>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Approved() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         */
        public Approved(Long accountId, String name, String email, List<Changeset.Avatar3> avatars) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar3> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar3> avatars) {
            this.avatars = avatars;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Approved.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Approved) == false) {
                return false;
            }
            Changeset.Approved rhs = ((Changeset.Approved) other);
            return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars"
    })
    public static class Approved2 {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar6> avatars = new ArrayList<Changeset.Avatar6>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Approved2() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         */
        public Approved2(Long accountId, String name, String email, List<Changeset.Avatar6> avatars) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar6> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar6> avatars) {
            this.avatars = avatars;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Approved2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Approved2) == false) {
                return false;
            }
            Changeset.Approved2 rhs = ((Changeset.Approved2) other);
            return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars",
            "tags"
    })
    public static class Approved3 {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar7> avatars = new ArrayList<Changeset.Avatar7>();
        @JsonProperty("tags")
        private List<String> tags = new ArrayList<String>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Approved3() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         * @param tags
         */
        public Approved3(Long accountId, String name, String email, List<Changeset.Avatar7> avatars, List<String> tags) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
            this.tags = tags;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar7> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar7> avatars) {
            this.avatars = avatars;
        }

        @JsonProperty("tags")
        public List<String> getTags() {
            return tags;
        }

        @JsonProperty("tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Approved3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("tags");
            sb.append('=');
            sb.append(((this.tags == null)?"<null>":this.tags));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Approved3) == false) {
                return false;
            }
            Changeset.Approved3 rhs = ((Changeset.Approved3) other);
            return (((((((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({

    })
    public static class AttentionSet {

        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.AttentionSet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.AttentionSet) == false) {
                return false;
            }
            Changeset.AttentionSet rhs = ((Changeset.AttentionSet) other);
            return ((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "optional"
    })
    public static class Autosubmit {

        @JsonProperty("optional")
        private Boolean optional;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Autosubmit() {
        }

        /**
         *
         * @param optional
         */
        public Autosubmit(Boolean optional) {
            super();
            this.optional = optional;
        }

        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        @JsonProperty("optional")
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Autosubmit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("optional");
            sb.append('=');
            sb.append(((this.optional == null)?"<null>":this.optional));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Autosubmit) == false) {
                return false;
            }
            Changeset.Autosubmit rhs = ((Changeset.Autosubmit) other);
            return (((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar) == false) {
                return false;
            }
            Changeset.Avatar rhs = ((Changeset.Avatar) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar10 {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar10() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar10(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar10 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar10) == false) {
                return false;
            }
            Changeset.Avatar10 rhs = ((Changeset.Avatar10) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar2 {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar2() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar2(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar2) == false) {
                return false;
            }
            Changeset.Avatar2 rhs = ((Changeset.Avatar2) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar3 {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar3() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar3(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar3) == false) {
                return false;
            }
            Changeset.Avatar3 rhs = ((Changeset.Avatar3) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar4 {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar4() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar4(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar4 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar4) == false) {
                return false;
            }
            Changeset.Avatar4 rhs = ((Changeset.Avatar4) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar5 {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar5() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar5(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar5 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar5) == false) {
                return false;
            }
            Changeset.Avatar5 rhs = ((Changeset.Avatar5) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar6 {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar6() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar6(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar6 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar6) == false) {
                return false;
            }
            Changeset.Avatar6 rhs = ((Changeset.Avatar6) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar7 {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar7() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar7(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar7 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar7) == false) {
                return false;
            }
            Changeset.Avatar7 rhs = ((Changeset.Avatar7) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar8 {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar8() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar8(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar8 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar8) == false) {
                return false;
            }
            Changeset.Avatar8 rhs = ((Changeset.Avatar8) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "height"
    })
    public static class Avatar9 {

        @JsonProperty("url")
        private String url;
        @JsonProperty("height")
        private Long height;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Avatar9() {
        }

        /**
         *
         * @param url
         * @param height
         */
        public Avatar9(String url, Long height) {
            super();
            this.url = url;
            this.height = height;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("height")
        public Long getHeight() {
            return height;
        }

        @JsonProperty("height")
        public void setHeight(Long height) {
            this.height = height;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Avatar9 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("url");
            sb.append('=');
            sb.append(((this.url == null)?"<null>":this.url));
            sb.append(',');
            sb.append("height");
            sb.append('=');
            sb.append(((this.height == null)?"<null>":this.height));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
            result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Avatar9) == false) {
                return false;
            }
            Changeset.Avatar9 rhs = ((Changeset.Avatar9) other);
            return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "optional"
    })
    public static class BuildCopOverride {

        @JsonProperty("optional")
        private Boolean optional;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public BuildCopOverride() {
        }

        /**
         *
         * @param optional
         */
        public BuildCopOverride(Boolean optional) {
            super();
            this.optional = optional;
        }

        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        @JsonProperty("optional")
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.BuildCopOverride.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("optional");
            sb.append('=');
            sb.append(((this.optional == null)?"<null>":this.optional));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.BuildCopOverride) == false) {
                return false;
            }
            Changeset.BuildCopOverride rhs = ((Changeset.BuildCopOverride) other);
            return (((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "optional"
    })
    public static class BypassPresubmit {

        @JsonProperty("optional")
        private Boolean optional;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public BypassPresubmit() {
        }

        /**
         *
         * @param optional
         */
        public BypassPresubmit(Boolean optional) {
            super();
            this.optional = optional;
        }

        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        @JsonProperty("optional")
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.BypassPresubmit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("optional");
            sb.append('=');
            sb.append(((this.optional == null)?"<null>":this.optional));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.BypassPresubmit) == false) {
                return false;
            }
            Changeset.BypassPresubmit rhs = ((Changeset.BypassPresubmit) other);
            return (((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars"
    })
    public static class Cc {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar9> avatars = new ArrayList<Changeset.Avatar9>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Cc() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         */
        public Cc(Long accountId, String name, String email, List<Changeset.Avatar9> avatars) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar9> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar9> avatars) {
            this.avatars = avatars;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Cc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Cc) == false) {
                return false;
            }
            Changeset.Cc rhs = ((Changeset.Cc) other);
            return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "approved"
    })
    public static class CodeReview {

        @JsonProperty("approved")
        private Changeset.Approved approved;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public CodeReview() {
        }

        /**
         *
         * @param approved
         */
        public CodeReview(Changeset.Approved approved) {
            super();
            this.approved = approved;
        }

        @JsonProperty("approved")
        public Changeset.Approved getApproved() {
            return approved;
        }

        @JsonProperty("approved")
        public void setApproved(Changeset.Approved approved) {
            this.approved = approved;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.CodeReview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("approved");
            sb.append('=');
            sb.append(((this.approved == null)?"<null>":this.approved));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.approved == null)? 0 :this.approved.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.CodeReview) == false) {
                return false;
            }
            Changeset.CodeReview rhs = ((Changeset.CodeReview) other);
            return (((this.approved == rhs.approved)||((this.approved!= null)&&this.approved.equals(rhs.approved)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "optional"
    })
    public static class GlobalApproval {

        @JsonProperty("optional")
        private Boolean optional;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public GlobalApproval() {
        }

        /**
         *
         * @param optional
         */
        public GlobalApproval(Boolean optional) {
            super();
            this.optional = optional;
        }

        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        @JsonProperty("optional")
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.GlobalApproval.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("optional");
            sb.append('=');
            sb.append(((this.optional == null)?"<null>":this.optional));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.GlobalApproval) == false) {
                return false;
            }
            Changeset.GlobalApproval rhs = ((Changeset.GlobalApproval) other);
            return (((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "Verified",
            "Code-Review",
            "Open-Source-Licensing",
            "Lint",
            "Global-Approval",
            "Autosubmit",
            "Presubmit-Ready",
            "Presubmit-Verified",
            "Bypass-Presubmit",
            "Presubmit-Verified-Together",
            "Build-Cop-Override"
    })
    public static class Labels {

        @JsonProperty("Verified")
        private Changeset.Verified verified;
        @JsonProperty("Code-Review")
        private Changeset.CodeReview codeReview;
        @JsonProperty("Open-Source-Licensing")
        private Changeset.OpenSourceLicensing openSourceLicensing;
        @JsonProperty("Lint")
        private Changeset.Lint lint;
        @JsonProperty("Global-Approval")
        private Changeset.GlobalApproval globalApproval;
        @JsonProperty("Autosubmit")
        private Changeset.Autosubmit autosubmit;
        @JsonProperty("Presubmit-Ready")
        private Changeset.PresubmitReady presubmitReady;
        @JsonProperty("Presubmit-Verified")
        private Changeset.PresubmitVerified presubmitVerified;
        @JsonProperty("Bypass-Presubmit")
        private Changeset.BypassPresubmit bypassPresubmit;
        @JsonProperty("Presubmit-Verified-Together")
        private Changeset.PresubmitVerifiedTogether presubmitVerifiedTogether;
        @JsonProperty("Build-Cop-Override")
        private Changeset.BuildCopOverride buildCopOverride;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Labels() {
        }

        /**
         *
         * @param lint
         * @param presubmitReady
         * @param codeReview
         * @param buildCopOverride
         * @param autosubmit
         * @param openSourceLicensing
         * @param presubmitVerifiedTogether
         * @param verified
         * @param bypassPresubmit
         * @param presubmitVerified
         * @param globalApproval
         */
        public Labels(Changeset.Verified verified, Changeset.CodeReview codeReview, Changeset.OpenSourceLicensing openSourceLicensing, Changeset.Lint lint, Changeset.GlobalApproval globalApproval, Changeset.Autosubmit autosubmit, Changeset.PresubmitReady presubmitReady, Changeset.PresubmitVerified presubmitVerified, Changeset.BypassPresubmit bypassPresubmit, Changeset.PresubmitVerifiedTogether presubmitVerifiedTogether, Changeset.BuildCopOverride buildCopOverride) {
            super();
            this.verified = verified;
            this.codeReview = codeReview;
            this.openSourceLicensing = openSourceLicensing;
            this.lint = lint;
            this.globalApproval = globalApproval;
            this.autosubmit = autosubmit;
            this.presubmitReady = presubmitReady;
            this.presubmitVerified = presubmitVerified;
            this.bypassPresubmit = bypassPresubmit;
            this.presubmitVerifiedTogether = presubmitVerifiedTogether;
            this.buildCopOverride = buildCopOverride;
        }

        @JsonProperty("Verified")
        public Changeset.Verified getVerified() {
            return verified;
        }

        @JsonProperty("Verified")
        public void setVerified(Changeset.Verified verified) {
            this.verified = verified;
        }

        @JsonProperty("Code-Review")
        public Changeset.CodeReview getCodeReview() {
            return codeReview;
        }

        @JsonProperty("Code-Review")
        public void setCodeReview(Changeset.CodeReview codeReview) {
            this.codeReview = codeReview;
        }

        @JsonProperty("Open-Source-Licensing")
        public Changeset.OpenSourceLicensing getOpenSourceLicensing() {
            return openSourceLicensing;
        }

        @JsonProperty("Open-Source-Licensing")
        public void setOpenSourceLicensing(Changeset.OpenSourceLicensing openSourceLicensing) {
            this.openSourceLicensing = openSourceLicensing;
        }

        @JsonProperty("Lint")
        public Changeset.Lint getLint() {
            return lint;
        }

        @JsonProperty("Lint")
        public void setLint(Changeset.Lint lint) {
            this.lint = lint;
        }

        @JsonProperty("Global-Approval")
        public Changeset.GlobalApproval getGlobalApproval() {
            return globalApproval;
        }

        @JsonProperty("Global-Approval")
        public void setGlobalApproval(Changeset.GlobalApproval globalApproval) {
            this.globalApproval = globalApproval;
        }

        @JsonProperty("Autosubmit")
        public Changeset.Autosubmit getAutosubmit() {
            return autosubmit;
        }

        @JsonProperty("Autosubmit")
        public void setAutosubmit(Changeset.Autosubmit autosubmit) {
            this.autosubmit = autosubmit;
        }

        @JsonProperty("Presubmit-Ready")
        public Changeset.PresubmitReady getPresubmitReady() {
            return presubmitReady;
        }

        @JsonProperty("Presubmit-Ready")
        public void setPresubmitReady(Changeset.PresubmitReady presubmitReady) {
            this.presubmitReady = presubmitReady;
        }

        @JsonProperty("Presubmit-Verified")
        public Changeset.PresubmitVerified getPresubmitVerified() {
            return presubmitVerified;
        }

        @JsonProperty("Presubmit-Verified")
        public void setPresubmitVerified(Changeset.PresubmitVerified presubmitVerified) {
            this.presubmitVerified = presubmitVerified;
        }

        @JsonProperty("Bypass-Presubmit")
        public Changeset.BypassPresubmit getBypassPresubmit() {
            return bypassPresubmit;
        }

        @JsonProperty("Bypass-Presubmit")
        public void setBypassPresubmit(Changeset.BypassPresubmit bypassPresubmit) {
            this.bypassPresubmit = bypassPresubmit;
        }

        @JsonProperty("Presubmit-Verified-Together")
        public Changeset.PresubmitVerifiedTogether getPresubmitVerifiedTogether() {
            return presubmitVerifiedTogether;
        }

        @JsonProperty("Presubmit-Verified-Together")
        public void setPresubmitVerifiedTogether(Changeset.PresubmitVerifiedTogether presubmitVerifiedTogether) {
            this.presubmitVerifiedTogether = presubmitVerifiedTogether;
        }

        @JsonProperty("Build-Cop-Override")
        public Changeset.BuildCopOverride getBuildCopOverride() {
            return buildCopOverride;
        }

        @JsonProperty("Build-Cop-Override")
        public void setBuildCopOverride(Changeset.BuildCopOverride buildCopOverride) {
            this.buildCopOverride = buildCopOverride;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Labels.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("verified");
            sb.append('=');
            sb.append(((this.verified == null)?"<null>":this.verified));
            sb.append(',');
            sb.append("codeReview");
            sb.append('=');
            sb.append(((this.codeReview == null)?"<null>":this.codeReview));
            sb.append(',');
            sb.append("openSourceLicensing");
            sb.append('=');
            sb.append(((this.openSourceLicensing == null)?"<null>":this.openSourceLicensing));
            sb.append(',');
            sb.append("lint");
            sb.append('=');
            sb.append(((this.lint == null)?"<null>":this.lint));
            sb.append(',');
            sb.append("globalApproval");
            sb.append('=');
            sb.append(((this.globalApproval == null)?"<null>":this.globalApproval));
            sb.append(',');
            sb.append("autosubmit");
            sb.append('=');
            sb.append(((this.autosubmit == null)?"<null>":this.autosubmit));
            sb.append(',');
            sb.append("presubmitReady");
            sb.append('=');
            sb.append(((this.presubmitReady == null)?"<null>":this.presubmitReady));
            sb.append(',');
            sb.append("presubmitVerified");
            sb.append('=');
            sb.append(((this.presubmitVerified == null)?"<null>":this.presubmitVerified));
            sb.append(',');
            sb.append("bypassPresubmit");
            sb.append('=');
            sb.append(((this.bypassPresubmit == null)?"<null>":this.bypassPresubmit));
            sb.append(',');
            sb.append("presubmitVerifiedTogether");
            sb.append('=');
            sb.append(((this.presubmitVerifiedTogether == null)?"<null>":this.presubmitVerifiedTogether));
            sb.append(',');
            sb.append("buildCopOverride");
            sb.append('=');
            sb.append(((this.buildCopOverride == null)?"<null>":this.buildCopOverride));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.presubmitReady == null)? 0 :this.presubmitReady.hashCode()));
            result = ((result* 31)+((this.verified == null)? 0 :this.verified.hashCode()));
            result = ((result* 31)+((this.globalApproval == null)? 0 :this.globalApproval.hashCode()));
            result = ((result* 31)+((this.lint == null)? 0 :this.lint.hashCode()));
            result = ((result* 31)+((this.codeReview == null)? 0 :this.codeReview.hashCode()));
            result = ((result* 31)+((this.buildCopOverride == null)? 0 :this.buildCopOverride.hashCode()));
            result = ((result* 31)+((this.autosubmit == null)? 0 :this.autosubmit.hashCode()));
            result = ((result* 31)+((this.openSourceLicensing == null)? 0 :this.openSourceLicensing.hashCode()));
            result = ((result* 31)+((this.presubmitVerifiedTogether == null)? 0 :this.presubmitVerifiedTogether.hashCode()));
            result = ((result* 31)+((this.bypassPresubmit == null)? 0 :this.bypassPresubmit.hashCode()));
            result = ((result* 31)+((this.presubmitVerified == null)? 0 :this.presubmitVerified.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Labels) == false) {
                return false;
            }
            Changeset.Labels rhs = ((Changeset.Labels) other);
            return (((((((((((((this.presubmitReady == rhs.presubmitReady)||((this.presubmitReady!= null)&&this.presubmitReady.equals(rhs.presubmitReady)))&&((this.verified == rhs.verified)||((this.verified!= null)&&this.verified.equals(rhs.verified))))&&((this.globalApproval == rhs.globalApproval)||((this.globalApproval!= null)&&this.globalApproval.equals(rhs.globalApproval))))&&((this.lint == rhs.lint)||((this.lint!= null)&&this.lint.equals(rhs.lint))))&&((this.codeReview == rhs.codeReview)||((this.codeReview!= null)&&this.codeReview.equals(rhs.codeReview))))&&((this.buildCopOverride == rhs.buildCopOverride)||((this.buildCopOverride!= null)&&this.buildCopOverride.equals(rhs.buildCopOverride))))&&((this.autosubmit == rhs.autosubmit)||((this.autosubmit!= null)&&this.autosubmit.equals(rhs.autosubmit))))&&((this.openSourceLicensing == rhs.openSourceLicensing)||((this.openSourceLicensing!= null)&&this.openSourceLicensing.equals(rhs.openSourceLicensing))))&&((this.presubmitVerifiedTogether == rhs.presubmitVerifiedTogether)||((this.presubmitVerifiedTogether!= null)&&this.presubmitVerifiedTogether.equals(rhs.presubmitVerifiedTogether))))&&((this.bypassPresubmit == rhs.bypassPresubmit)||((this.bypassPresubmit!= null)&&this.bypassPresubmit.equals(rhs.bypassPresubmit))))&&((this.presubmitVerified == rhs.presubmitVerified)||((this.presubmitVerified!= null)&&this.presubmitVerified.equals(rhs.presubmitVerified))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "recommended",
            "value",
            "optional"
    })
    public static class Lint {

        @JsonProperty("recommended")
        private Changeset.Recommended2 recommended;
        @JsonProperty("value")
        private Long value;
        @JsonProperty("optional")
        private Boolean optional;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Lint() {
        }

        /**
         *
         * @param optional
         * @param value
         * @param recommended
         */
        public Lint(Changeset.Recommended2 recommended, Long value, Boolean optional) {
            super();
            this.recommended = recommended;
            this.value = value;
            this.optional = optional;
        }

        @JsonProperty("recommended")
        public Changeset.Recommended2 getRecommended() {
            return recommended;
        }

        @JsonProperty("recommended")
        public void setRecommended(Changeset.Recommended2 recommended) {
            this.recommended = recommended;
        }

        @JsonProperty("value")
        public Long getValue() {
            return value;
        }

        @JsonProperty("value")
        public void setValue(Long value) {
            this.value = value;
        }

        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        @JsonProperty("optional")
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Lint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("recommended");
            sb.append('=');
            sb.append(((this.recommended == null)?"<null>":this.recommended));
            sb.append(',');
            sb.append("value");
            sb.append('=');
            sb.append(((this.value == null)?"<null>":this.value));
            sb.append(',');
            sb.append("optional");
            sb.append('=');
            sb.append(((this.optional == null)?"<null>":this.optional));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
            result = ((result* 31)+((this.recommended == null)? 0 :this.recommended.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Lint) == false) {
                return false;
            }
            Changeset.Lint rhs = ((Changeset.Lint) other);
            return (((((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.recommended == rhs.recommended)||((this.recommended!= null)&&this.recommended.equals(rhs.recommended))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "recommended",
            "value",
            "optional"
    })
    public static class OpenSourceLicensing {

        @JsonProperty("recommended")
        private Changeset.Recommended recommended;
        @JsonProperty("value")
        private Long value;
        @JsonProperty("optional")
        private Boolean optional;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public OpenSourceLicensing() {
        }

        /**
         *
         * @param optional
         * @param value
         * @param recommended
         */
        public OpenSourceLicensing(Changeset.Recommended recommended, Long value, Boolean optional) {
            super();
            this.recommended = recommended;
            this.value = value;
            this.optional = optional;
        }

        @JsonProperty("recommended")
        public Changeset.Recommended getRecommended() {
            return recommended;
        }

        @JsonProperty("recommended")
        public void setRecommended(Changeset.Recommended recommended) {
            this.recommended = recommended;
        }

        @JsonProperty("value")
        public Long getValue() {
            return value;
        }

        @JsonProperty("value")
        public void setValue(Long value) {
            this.value = value;
        }

        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        @JsonProperty("optional")
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.OpenSourceLicensing.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("recommended");
            sb.append('=');
            sb.append(((this.recommended == null)?"<null>":this.recommended));
            sb.append(',');
            sb.append("value");
            sb.append('=');
            sb.append(((this.value == null)?"<null>":this.value));
            sb.append(',');
            sb.append("optional");
            sb.append('=');
            sb.append(((this.optional == null)?"<null>":this.optional));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
            result = ((result* 31)+((this.recommended == null)? 0 :this.recommended.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.OpenSourceLicensing) == false) {
                return false;
            }
            Changeset.OpenSourceLicensing rhs = ((Changeset.OpenSourceLicensing) other);
            return (((((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.recommended == rhs.recommended)||((this.recommended!= null)&&this.recommended.equals(rhs.recommended))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars"
    })
    public static class Owner {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar2> avatars = new ArrayList<Changeset.Avatar2>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Owner() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         */
        public Owner(Long accountId, String name, String email, List<Changeset.Avatar2> avatars) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar2> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar2> avatars) {
            this.avatars = avatars;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Owner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Owner) == false) {
                return false;
            }
            Changeset.Owner rhs = ((Changeset.Owner) other);
            return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({

    })
    public static class PendingReviewers {

        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.PendingReviewers.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.PendingReviewers) == false) {
                return false;
            }
            Changeset.PendingReviewers rhs = ((Changeset.PendingReviewers) other);
            return ((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "approved",
            "optional"
    })
    public static class PresubmitReady {

        @JsonProperty("approved")
        private Changeset.Approved2 approved;
        @JsonProperty("optional")
        private Boolean optional;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public PresubmitReady() {
        }

        /**
         *
         * @param approved
         * @param optional
         */
        public PresubmitReady(Changeset.Approved2 approved, Boolean optional) {
            super();
            this.approved = approved;
            this.optional = optional;
        }

        @JsonProperty("approved")
        public Changeset.Approved2 getApproved() {
            return approved;
        }

        @JsonProperty("approved")
        public void setApproved(Changeset.Approved2 approved) {
            this.approved = approved;
        }

        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        @JsonProperty("optional")
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.PresubmitReady.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("approved");
            sb.append('=');
            sb.append(((this.approved == null)?"<null>":this.approved));
            sb.append(',');
            sb.append("optional");
            sb.append('=');
            sb.append(((this.optional == null)?"<null>":this.optional));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.approved == null)? 0 :this.approved.hashCode()));
            result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.PresubmitReady) == false) {
                return false;
            }
            Changeset.PresubmitReady rhs = ((Changeset.PresubmitReady) other);
            return ((((this.approved == rhs.approved)||((this.approved!= null)&&this.approved.equals(rhs.approved)))&&((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "approved"
    })
    public static class PresubmitVerified {

        @JsonProperty("approved")
        private Changeset.Approved3 approved;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public PresubmitVerified() {
        }

        /**
         *
         * @param approved
         */
        public PresubmitVerified(Changeset.Approved3 approved) {
            super();
            this.approved = approved;
        }

        @JsonProperty("approved")
        public Changeset.Approved3 getApproved() {
            return approved;
        }

        @JsonProperty("approved")
        public void setApproved(Changeset.Approved3 approved) {
            this.approved = approved;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.PresubmitVerified.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("approved");
            sb.append('=');
            sb.append(((this.approved == null)?"<null>":this.approved));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.approved == null)? 0 :this.approved.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.PresubmitVerified) == false) {
                return false;
            }
            Changeset.PresubmitVerified rhs = ((Changeset.PresubmitVerified) other);
            return (((this.approved == rhs.approved)||((this.approved!= null)&&this.approved.equals(rhs.approved)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "optional"
    })
    public static class PresubmitVerifiedTogether {

        @JsonProperty("optional")
        private Boolean optional;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public PresubmitVerifiedTogether() {
        }

        /**
         *
         * @param optional
         */
        public PresubmitVerifiedTogether(Boolean optional) {
            super();
            this.optional = optional;
        }

        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        @JsonProperty("optional")
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.PresubmitVerifiedTogether.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("optional");
            sb.append('=');
            sb.append(((this.optional == null)?"<null>":this.optional));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.PresubmitVerifiedTogether) == false) {
                return false;
            }
            Changeset.PresubmitVerifiedTogether rhs = ((Changeset.PresubmitVerifiedTogether) other);
            return (((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars",
            "tags"
    })
    public static class Recommended {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar4> avatars = new ArrayList<Changeset.Avatar4>();
        @JsonProperty("tags")
        private List<String> tags = new ArrayList<String>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Recommended() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         * @param tags
         */
        public Recommended(Long accountId, String name, String email, List<Changeset.Avatar4> avatars, List<String> tags) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
            this.tags = tags;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar4> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar4> avatars) {
            this.avatars = avatars;
        }

        @JsonProperty("tags")
        public List<String> getTags() {
            return tags;
        }

        @JsonProperty("tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Recommended.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("tags");
            sb.append('=');
            sb.append(((this.tags == null)?"<null>":this.tags));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Recommended) == false) {
                return false;
            }
            Changeset.Recommended rhs = ((Changeset.Recommended) other);
            return (((((((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars",
            "tags"
    })
    public static class Recommended2 {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar5> avatars = new ArrayList<Changeset.Avatar5>();
        @JsonProperty("tags")
        private List<String> tags = new ArrayList<String>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Recommended2() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         * @param tags
         */
        public Recommended2(Long accountId, String name, String email, List<Changeset.Avatar5> avatars, List<String> tags) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
            this.tags = tags;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar5> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar5> avatars) {
            this.avatars = avatars;
        }

        @JsonProperty("tags")
        public List<String> getTags() {
            return tags;
        }

        @JsonProperty("tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Recommended2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("tags");
            sb.append('=');
            sb.append(((this.tags == null)?"<null>":this.tags));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Recommended2) == false) {
                return false;
            }
            Changeset.Recommended2 rhs = ((Changeset.Recommended2) other);
            return (((((((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars",
            "tags"
    })
    public static class RemovableReviewer {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar8> avatars = new ArrayList<Changeset.Avatar8>();
        @JsonProperty("tags")
        private List<String> tags = new ArrayList<String>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public RemovableReviewer() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         * @param tags
         */
        public RemovableReviewer(Long accountId, String name, String email, List<Changeset.Avatar8> avatars, List<String> tags) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
            this.tags = tags;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar8> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar8> avatars) {
            this.avatars = avatars;
        }

        @JsonProperty("tags")
        public List<String> getTags() {
            return tags;
        }

        @JsonProperty("tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.RemovableReviewer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("tags");
            sb.append('=');
            sb.append(((this.tags == null)?"<null>":this.tags));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.RemovableReviewer) == false) {
                return false;
            }
            Changeset.RemovableReviewer rhs = ((Changeset.RemovableReviewer) other);
            return (((((((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars",
            "tags"
    })
    public static class Reviewer {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar10> avatars = new ArrayList<Changeset.Avatar10>();
        @JsonProperty("tags")
        private List<String> tags = new ArrayList<String>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Reviewer() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         * @param tags
         */
        public Reviewer(Long accountId, String name, String email, List<Changeset.Avatar10> avatars, List<String> tags) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
            this.tags = tags;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar10> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar10> avatars) {
            this.avatars = avatars;
        }

        @JsonProperty("tags")
        public List<String> getTags() {
            return tags;
        }

        @JsonProperty("tags")
        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Reviewer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("tags");
            sb.append('=');
            sb.append(((this.tags == null)?"<null>":this.tags));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Reviewer) == false) {
                return false;
            }
            Changeset.Reviewer rhs = ((Changeset.Reviewer) other);
            return (((((((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "CC",
            "REVIEWER"
    })
    public static class Reviewers {

        @JsonProperty("CC")
        private List<Changeset.Cc> cc = new ArrayList<Changeset.Cc>();
        @JsonProperty("REVIEWER")
        private List<Changeset.Reviewer> reviewer = new ArrayList<Changeset.Reviewer>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Reviewers() {
        }

        /**
         *
         * @param cc
         * @param reviewer
         */
        public Reviewers(List<Changeset.Cc> cc, List<Changeset.Reviewer> reviewer) {
            super();
            this.cc = cc;
            this.reviewer = reviewer;
        }

        @JsonProperty("CC")
        public List<Changeset.Cc> getCc() {
            return cc;
        }

        @JsonProperty("CC")
        public void setCc(List<Changeset.Cc> cc) {
            this.cc = cc;
        }

        @JsonProperty("REVIEWER")
        public List<Changeset.Reviewer> getReviewer() {
            return reviewer;
        }

        @JsonProperty("REVIEWER")
        public void setReviewer(List<Changeset.Reviewer> reviewer) {
            this.reviewer = reviewer;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Reviewers.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("cc");
            sb.append('=');
            sb.append(((this.cc == null)?"<null>":this.cc));
            sb.append(',');
            sb.append("reviewer");
            sb.append('=');
            sb.append(((this.reviewer == null)?"<null>":this.reviewer));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.cc == null)? 0 :this.cc.hashCode()));
            result = ((result* 31)+((this.reviewer == null)? 0 :this.reviewer.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Reviewers) == false) {
                return false;
            }
            Changeset.Reviewers rhs = ((Changeset.Reviewers) other);
            return ((((this.cc == rhs.cc)||((this.cc!= null)&&this.cc.equals(rhs.cc)))&&((this.reviewer == rhs.reviewer)||((this.reviewer!= null)&&this.reviewer.equals(rhs.reviewer))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "_account_id",
            "name",
            "email",
            "avatars"
    })
    public static class Submitter {

        @JsonProperty("_account_id")
        private Long accountId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("email")
        private String email;
        @JsonProperty("avatars")
        private List<Changeset.Avatar> avatars = new ArrayList<Changeset.Avatar>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Submitter() {
        }

        /**
         *
         * @param accountId
         * @param name
         * @param email
         * @param avatars
         */
        public Submitter(Long accountId, String name, String email, List<Changeset.Avatar> avatars) {
            super();
            this.accountId = accountId;
            this.name = name;
            this.email = email;
            this.avatars = avatars;
        }

        @JsonProperty("_account_id")
        public Long getAccountId() {
            return accountId;
        }

        @JsonProperty("_account_id")
        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("avatars")
        public List<Changeset.Avatar> getAvatars() {
            return avatars;
        }

        @JsonProperty("avatars")
        public void setAvatars(List<Changeset.Avatar> avatars) {
            this.avatars = avatars;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Submitter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("accountId");
            sb.append('=');
            sb.append(((this.accountId == null)?"<null>":this.accountId));
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("email");
            sb.append('=');
            sb.append(((this.email == null)?"<null>":this.email));
            sb.append(',');
            sb.append("avatars");
            sb.append('=');
            sb.append(((this.avatars == null)?"<null>":this.avatars));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
            result = ((result* 31)+((this.avatars == null)? 0 :this.avatars.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Submitter) == false) {
                return false;
            }
            Changeset.Submitter rhs = ((Changeset.Submitter) other);
            return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.avatars == rhs.avatars)||((this.avatars!= null)&&this.avatars.equals(rhs.avatars))));
        }

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "optional"
    })
    public static class Verified {

        @JsonProperty("optional")
        private Boolean optional;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public Verified() {
        }

        /**
         *
         * @param optional
         */
        public Verified(Boolean optional) {
            super();
            this.optional = optional;
        }

        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        @JsonProperty("optional")
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Changeset.Verified.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("optional");
            sb.append('=');
            sb.append(((this.optional == null)?"<null>":this.optional));
            sb.append(',');
            sb.append("additionalProperties");
            sb.append('=');
            sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Changeset.Verified) == false) {
                return false;
            }
            Changeset.Verified rhs = ((Changeset.Verified) other);
            return (((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
        }

    }

}
