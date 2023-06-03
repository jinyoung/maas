<template>

    <v-card outlined>
        <v-card-title>
            CreateUserPreference
        </v-card-title>

        <v-card-text>
            <String label="UserId" v-model="value.userId" :editMode="editMode"/>
            <Boolean label="AccessibleTransportation" v-model="value.accessibleTransportation" :editMode="editMode"/>
            <Boolean label="AssistanceRequired" v-model="value.assistanceRequired" :editMode="editMode"/>
            <String label="Language" v-model="value.language" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createUserPreference"
            >
                CreateUserPreference
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateUserPreferenceCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.userId = '';
            this.value.accessibleTransportation = false;
            this.value.assistanceRequired = false;
            this.value.language = '';
        },
        watch: {
        },
        methods: {
            createUserPreference() {
                this.$emit('createUserPreference', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

